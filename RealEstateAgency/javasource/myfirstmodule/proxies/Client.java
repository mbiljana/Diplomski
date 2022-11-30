// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Client
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject clientMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Client";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		username("username"),
		pass("pass"),
		name("name"),
		phoneNumber("phoneNumber"),
		email("email");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Client(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Client"));
	}

	protected Client(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject clientMendixObject)
	{
		if (clientMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Client", clientMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Client");

		this.clientMendixObject = clientMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Client.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Client initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Client.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Client initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Client(context, mendixObject);
	}

	public static myfirstmodule.proxies.Client load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Client.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Client> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Client> result = new java.util.ArrayList<myfirstmodule.proxies.Client>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Client" + xpathConstraint))
			result.add(myfirstmodule.proxies.Client.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of username
	 */
	public final java.lang.String getusername()
	{
		return getusername(getContext());
	}

	/**
	 * @param context
	 * @return value of username
	 */
	public final java.lang.String getusername(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.username.toString());
	}

	/**
	 * Set value of username
	 * @param username
	 */
	public final void setusername(java.lang.String username)
	{
		setusername(getContext(), username);
	}

	/**
	 * Set value of username
	 * @param context
	 * @param username
	 */
	public final void setusername(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String username)
	{
		getMendixObject().setValue(context, MemberNames.username.toString(), username);
	}

	/**
	 * @return value of pass
	 */
	public final java.lang.String getpass()
	{
		return getpass(getContext());
	}

	/**
	 * @param context
	 * @return value of pass
	 */
	public final java.lang.String getpass(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.pass.toString());
	}

	/**
	 * Set value of pass
	 * @param pass
	 */
	public final void setpass(java.lang.String pass)
	{
		setpass(getContext(), pass);
	}

	/**
	 * Set value of pass
	 * @param context
	 * @param pass
	 */
	public final void setpass(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String pass)
	{
		getMendixObject().setValue(context, MemberNames.pass.toString(), pass);
	}

	/**
	 * @return value of name
	 */
	public final java.lang.String getname()
	{
		return getname(getContext());
	}

	/**
	 * @param context
	 * @return value of name
	 */
	public final java.lang.String getname(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.name.toString());
	}

	/**
	 * Set value of name
	 * @param name
	 */
	public final void setname(java.lang.String name)
	{
		setname(getContext(), name);
	}

	/**
	 * Set value of name
	 * @param context
	 * @param name
	 */
	public final void setname(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.name.toString(), name);
	}

	/**
	 * @return value of phoneNumber
	 */
	public final java.lang.String getphoneNumber()
	{
		return getphoneNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of phoneNumber
	 */
	public final java.lang.String getphoneNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.phoneNumber.toString());
	}

	/**
	 * Set value of phoneNumber
	 * @param phonenumber
	 */
	public final void setphoneNumber(java.lang.String phonenumber)
	{
		setphoneNumber(getContext(), phonenumber);
	}

	/**
	 * Set value of phoneNumber
	 * @param context
	 * @param phonenumber
	 */
	public final void setphoneNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String phonenumber)
	{
		getMendixObject().setValue(context, MemberNames.phoneNumber.toString(), phonenumber);
	}

	/**
	 * @return value of email
	 */
	public final java.lang.String getemail()
	{
		return getemail(getContext());
	}

	/**
	 * @param context
	 * @return value of email
	 */
	public final java.lang.String getemail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.email.toString());
	}

	/**
	 * Set value of email
	 * @param email
	 */
	public final void setemail(java.lang.String email)
	{
		setemail(getContext(), email);
	}

	/**
	 * Set value of email
	 * @param context
	 * @param email
	 */
	public final void setemail(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String email)
	{
		getMendixObject().setValue(context, MemberNames.email.toString(), email);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return clientMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Client that = (myfirstmodule.proxies.Client) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MyFirstModule.Client";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
