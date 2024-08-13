package Training;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class javaService

{
	// ---( internal utility methods )---

	final static javaService _instance = new javaService();

	static javaService _newInstance() { return new javaService(); }

	static javaService _cast(Object o) { return (javaService)o; }

	// ---( server methods )---




	public static final void formatPerusahaan (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(formatPerusahaan)>> ---
		// @sigtype java 3.5
		// [i] field:0:required namaPerusahaan
		// [i] field:0:required statusPerusahaan
		// [o] field:0:required namaPerusahaan
		//pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String namaPerusahaan = IDataUtil.getString(pipelineCursor, "namaPerusahaan");
			String statusPerusahaan = IDataUtil.getString(pipelineCursor, "statusPerusahaan");
		pipelineCursor.destroy();
		
		// process
		if (namaPerusahaan.startsWith("PT.") && "Terbuka".equals(statusPerusahaan)) {
		namaPerusahaan = namaPerusahaan.toUpperCase().concat(" Tbk.");
		}
		
		//pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put(pipelineCursor_1, "namaPerusahaan", namaPerusahaan);
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void myFirstJavaServices (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(myFirstJavaServices)>> ---
		// @sigtype java 3.5
		// [i] field:0:required inputString
		// [o] field:0:required outputString
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	inputString = IDataUtil.getString( pipelineCursor, "inputString" );
		pipelineCursor.destroy();
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "outputString", "outputString" );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void mySecondJavaServices (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(mySecondJavaServices)>> ---
		// @sigtype java 3.5
		// --- <<IS-END>> ---

                
	}
}

