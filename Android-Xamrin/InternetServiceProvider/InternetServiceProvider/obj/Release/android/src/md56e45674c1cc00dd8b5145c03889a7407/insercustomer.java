package md56e45674c1cc00dd8b5145c03889a7407;


public class insercustomer
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("InternetServiceProvider.Activities.insercustomer, InternetServiceProvider, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", insercustomer.class, __md_methods);
	}


	public insercustomer () throws java.lang.Throwable
	{
		super ();
		if (getClass () == insercustomer.class)
			mono.android.TypeManager.Activate ("InternetServiceProvider.Activities.insercustomer, InternetServiceProvider, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}