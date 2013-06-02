package com.calculator.soma.activator
;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.calculator.soma.Soma;
import com.calculator.soma.impl.SomaImpl;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		System.out.println("soma bundle iniciado");
		bundleContext.registerService(Soma.class, new SomaImpl(), null);
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("soma bundle parado");
	}

}
