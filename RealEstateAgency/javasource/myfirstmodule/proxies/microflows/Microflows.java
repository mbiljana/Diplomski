// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the MyFirstModule module
	public static void activateAd(IContext context, myfirstmodule.proxies.Advertisement _advertisement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Advertisement", _advertisement == null ? null : _advertisement.getMendixObject());
		Core.microflowCall("MyFirstModule.ActivateAd").withParams(params).execute(context);
	}
	public static void addAdPhoto_mf(IContext context, myfirstmodule.proxies.Advertisement _advertisement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Advertisement", _advertisement == null ? null : _advertisement.getMendixObject());
		Core.microflowCall("MyFirstModule.AddAdPhoto_mf").withParams(params).execute(context);
	}
	public static void addDocument_mf(IContext context, myfirstmodule.proxies.Advertisement _advertisement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Advertisement", _advertisement == null ? null : _advertisement.getMendixObject());
		Core.microflowCall("MyFirstModule.AddDocument_mf").withParams(params).execute(context);
	}
	public static void addNewAd_Agent_mf(IContext context, myfirstmodule.proxies.Agent _agent, myfirstmodule.proxies.Advertisement _advertisement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Agent", _agent == null ? null : _agent.getMendixObject());
		params.put("Advertisement", _advertisement == null ? null : _advertisement.getMendixObject());
		Core.microflowCall("MyFirstModule.AddNewAd_Agent_mf").withParams(params).execute(context);
	}
	public static java.util.List<myfirstmodule.proxies.Appointment> appointments_mf(IContext context, myfirstmodule.proxies.CreateAvailableAppointments_DataGrid _paging)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Paging", _paging == null ? null : _paging.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("MyFirstModule.Appointments_mf").withParams(params).execute(context);
		java.util.List<myfirstmodule.proxies.Appointment> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(myfirstmodule.proxies.Appointment.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<myfirstmodule.proxies.Agent> assignAgent_mf(IContext context, myfirstmodule.proxies.Advertisement _advertisement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Advertisement", _advertisement == null ? null : _advertisement.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("MyFirstModule.AssignAgent_mf").withParams(params).execute(context);
		java.util.List<myfirstmodule.proxies.Agent> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(myfirstmodule.proxies.Agent.initialize(context, obj));
		}
		return result;
	}
	public static void changeAd_mf(IContext context, myfirstmodule.proxies.Advertisement _advertisement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Advertisement", _advertisement == null ? null : _advertisement.getMendixObject());
		Core.microflowCall("MyFirstModule.ChangeAd_mf").withParams(params).execute(context);
	}
	public static void chooseAppointment_mf(IContext context, myfirstmodule.proxies.Appointment _appointment, myfirstmodule.proxies.Advertisement _advertisement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Appointment", _appointment == null ? null : _appointment.getMendixObject());
		params.put("Advertisement", _advertisement == null ? null : _advertisement.getMendixObject());
		Core.microflowCall("MyFirstModule.ChooseAppointment_mf").withParams(params).execute(context);
	}
	public static java.util.List<myfirstmodule.proxies.ClientContacts> clientContacts_mf(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.List<IMendixObject> objs = Core.microflowCall("MyFirstModule.ClientContacts_mf").withParams(params).execute(context);
		java.util.List<myfirstmodule.proxies.ClientContacts> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(myfirstmodule.proxies.ClientContacts.initialize(context, obj));
		}
		return result;
	}
	public static void confirmDocumentation_mf(IContext context, myfirstmodule.proxies.Advertisement _advertisement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Advertisement", _advertisement == null ? null : _advertisement.getMendixObject());
		Core.microflowCall("MyFirstModule.ConfirmDocumentation_mf").withParams(params).execute(context);
	}
	public static void confirmValidity_mf(IContext context, myfirstmodule.proxies.Advertisement _advertisement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Advertisement", _advertisement == null ? null : _advertisement.getMendixObject());
		Core.microflowCall("MyFirstModule.ConfirmValidity_mf").withParams(params).execute(context);
	}
	public static void contactAgent_mf(IContext context, myfirstmodule.proxies.Advertisement _advertisement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Advertisement", _advertisement == null ? null : _advertisement.getMendixObject());
		Core.microflowCall("MyFirstModule.ContactAgent_mf").withParams(params).execute(context);
	}
	public static void createAd_mf(IContext context, myfirstmodule.proxies.Advertisement _advertisement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Advertisement", _advertisement == null ? null : _advertisement.getMendixObject());
		Core.microflowCall("MyFirstModule.CreateAd_mf").withParams(params).execute(context);
	}
	public static void createAdvertisement(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MyFirstModule.CreateAdvertisement").withParams(params).execute(context);
	}
	public static void createAppointment_mf(IContext context, myfirstmodule.proxies.Appointment _appointment)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Appointment", _appointment == null ? null : _appointment.getMendixObject());
		Core.microflowCall("MyFirstModule.CreateAppointment_mf").withParams(params).execute(context);
	}
	public static java.util.List<myfirstmodule.proxies.Client> currentClient_mf(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.List<IMendixObject> objs = Core.microflowCall("MyFirstModule.CurrentClient_mf").withParams(params).execute(context);
		java.util.List<myfirstmodule.proxies.Client> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(myfirstmodule.proxies.Client.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<myfirstmodule.proxies.Advertisement> documentationConfirmation_mf(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.List<IMendixObject> objs = Core.microflowCall("MyFirstModule.DocumentationConfirmation_mf").withParams(params).execute(context);
		java.util.List<myfirstmodule.proxies.Advertisement> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(myfirstmodule.proxies.Advertisement.initialize(context, obj));
		}
		return result;
	}
	public static void editCondition_mf(IContext context, myfirstmodule.proxies.Advertisement _advertisement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Advertisement", _advertisement == null ? null : _advertisement.getMendixObject());
		Core.microflowCall("MyFirstModule.EditCondition_mf").withParams(params).execute(context);
	}
	public static void generateDocumentAd(IContext context, myfirstmodule.proxies.Advertisement _advertisement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Advertisement", _advertisement == null ? null : _advertisement.getMendixObject());
		Core.microflowCall("MyFirstModule.GenerateDocumentAd").withParams(params).execute(context);
	}
	public static void pageGenerator(IContext context, myfirstmodule.proxies.Advertisement _advertisement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Advertisement", _advertisement == null ? null : _advertisement.getMendixObject());
		Core.microflowCall("MyFirstModule.PageGenerator").withParams(params).execute(context);
	}
	public static void passAd(IContext context, myfirstmodule.proxies.Advertisement _advertisement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Advertisement", _advertisement == null ? null : _advertisement.getMendixObject());
		Core.microflowCall("MyFirstModule.PassAd").withParams(params).execute(context);
	}
	public static myfirstmodule.proxies.Client passNewClient_mf(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MyFirstModule.PassNewClient_mf").withParams(params).execute(context);
		return result == null ? null : myfirstmodule.proxies.Client.initialize(context, result);
	}
	public static void pendingRequests_mf(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MyFirstModule.PendingRequests_mf").withParams(params).execute(context);
	}
	public static void register_mf(IContext context, myfirstmodule.proxies.Client _client)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Client", _client == null ? null : _client.getMendixObject());
		Core.microflowCall("MyFirstModule.Register_mf").withParams(params).execute(context);
	}
	public static void saveNewAgent_mf(IContext context, myfirstmodule.proxies.Agent _agent)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Agent", _agent == null ? null : _agent.getMendixObject());
		Core.microflowCall("MyFirstModule.SaveNewAgent_mf").withParams(params).execute(context);
	}
	public static void saveNewClient_mf(IContext context, myfirstmodule.proxies.Client _client)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Client", _client == null ? null : _client.getMendixObject());
		Core.microflowCall("MyFirstModule.SaveNewClient_mf").withParams(params).execute(context);
	}
	public static void scheduleViewing_mf(IContext context, myfirstmodule.proxies.Advertisement _advertisement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Advertisement", _advertisement == null ? null : _advertisement.getMendixObject());
		Core.microflowCall("MyFirstModule.ScheduleViewing_mf").withParams(params).execute(context);
	}
	public static java.util.List<myfirstmodule.proxies.Advertisement> sortingAds(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.List<IMendixObject> objs = Core.microflowCall("MyFirstModule.SortingAds").withParams(params).execute(context);
		java.util.List<myfirstmodule.proxies.Advertisement> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(myfirstmodule.proxies.Advertisement.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<myfirstmodule.proxies.Appointment> takenAppointments_mf(IContext context, myfirstmodule.proxies.CreateAvailableAppointments_DataGrid _createAvailableAppointments_DataGrid)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("CreateAvailableAppointments_DataGrid", _createAvailableAppointments_DataGrid == null ? null : _createAvailableAppointments_DataGrid.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("MyFirstModule.TakenAppointments_mf").withParams(params).execute(context);
		java.util.List<myfirstmodule.proxies.Appointment> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(myfirstmodule.proxies.Appointment.initialize(context, obj));
		}
		return result;
	}
	public static void uploadAdPhoto(IContext context, myfirstmodule.proxies.AdPhoto _adPhoto, myfirstmodule.proxies.Advertisement _advertisement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("AdPhoto", _adPhoto == null ? null : _adPhoto.getMendixObject());
		params.put("Advertisement", _advertisement == null ? null : _advertisement.getMendixObject());
		Core.microflowCall("MyFirstModule.UploadAdPhoto").withParams(params).execute(context);
	}
	public static boolean uploadAllPhotos(IContext context, myfirstmodule.proxies.AdPhoto _adPhoto)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("AdPhoto", _adPhoto == null ? null : _adPhoto.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.UploadAllPhotos").withParams(params).execute(context);
	}
	public static void uploadPhotos_mf(IContext context, myfirstmodule.proxies.Advertisement _advertisement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Advertisement", _advertisement == null ? null : _advertisement.getMendixObject());
		Core.microflowCall("MyFirstModule.UploadPhotos_mf").withParams(params).execute(context);
	}
	public static java.util.List<myfirstmodule.proxies.Advertisement> userCheck(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.List<IMendixObject> objs = Core.microflowCall("MyFirstModule.UserCheck").withParams(params).execute(context);
		java.util.List<myfirstmodule.proxies.Advertisement> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(myfirstmodule.proxies.Advertisement.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<myfirstmodule.proxies.Advertisement> validationConfirmation_mf(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.List<IMendixObject> objs = Core.microflowCall("MyFirstModule.ValidationConfirmation_mf").withParams(params).execute(context);
		java.util.List<myfirstmodule.proxies.Advertisement> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(myfirstmodule.proxies.Advertisement.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<myfirstmodule.proxies.Documents> viewAdDocuments_mf(IContext context, myfirstmodule.proxies.Advertisement _advertisement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Advertisement", _advertisement == null ? null : _advertisement.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("MyFirstModule.ViewAdDocuments_mf").withParams(params).execute(context);
		java.util.List<myfirstmodule.proxies.Documents> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(myfirstmodule.proxies.Documents.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<myfirstmodule.proxies.Photos> viewAdPhotos_mf(IContext context, myfirstmodule.proxies.Advertisement _advertisement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Advertisement", _advertisement == null ? null : _advertisement.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("MyFirstModule.ViewAdPhotos_mf").withParams(params).execute(context);
		java.util.List<myfirstmodule.proxies.Photos> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(myfirstmodule.proxies.Photos.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<myfirstmodule.proxies.Documents> viewDocs_mf(IContext context, myfirstmodule.proxies.Advertisement _advertisement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Advertisement", _advertisement == null ? null : _advertisement.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("MyFirstModule.ViewDocs_mf").withParams(params).execute(context);
		java.util.List<myfirstmodule.proxies.Documents> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(myfirstmodule.proxies.Documents.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<myfirstmodule.proxies.Documents> viewDocument_mf(IContext context, myfirstmodule.proxies.Advertisement _advertisement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Advertisement", _advertisement == null ? null : _advertisement.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("MyFirstModule.ViewDocument_mf").withParams(params).execute(context);
		java.util.List<myfirstmodule.proxies.Documents> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(myfirstmodule.proxies.Documents.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<myfirstmodule.proxies.Appointment> viewing_mf(IContext context, myfirstmodule.proxies.Advertisement _advertisement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Advertisement", _advertisement == null ? null : _advertisement.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("MyFirstModule.Viewing_mf").withParams(params).execute(context);
		java.util.List<myfirstmodule.proxies.Appointment> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(myfirstmodule.proxies.Appointment.initialize(context, obj));
		}
		return result;
	}
	public static void viewOneApartment(IContext context, myfirstmodule.proxies.Advertisement _advertisement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Advertisement", _advertisement == null ? null : _advertisement.getMendixObject());
		Core.microflowCall("MyFirstModule.ViewOneApartment").withParams(params).execute(context);
	}
}