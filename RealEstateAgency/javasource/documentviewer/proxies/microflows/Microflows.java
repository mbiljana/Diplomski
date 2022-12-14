// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package documentviewer.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the DocumentViewer module
	public static documentviewer.proxies.PDF aCT_UpdatePDF(IContext context, documentviewer.proxies.PDF _pDF)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("PDF", _pDF == null ? null : _pDF.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("DocumentViewer.ACT_UpdatePDF").withParams(params).execute(context);
		return result == null ? null : documentviewer.proxies.PDF.initialize(context, result);
	}
	public static documentviewer.proxies.PDF dS_GetPDF(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("DocumentViewer.DS_GetPDF").withParams(params).execute(context);
		return result == null ? null : documentviewer.proxies.PDF.initialize(context, result);
	}
}