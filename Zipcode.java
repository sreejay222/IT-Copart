package mostApproritate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.json.JSONObject;

public class DNA {
	public String getcity(String zip1) {
		String API_Key = "gfxeiptpyQZMuTWQisQItZDXgVtHCNTT3r7mRBMprLbWF8NXBDG4Ck2TfvASjuLn";
		//String url = "https://www.zipcodeapi.com/rest/" + API_Key + "/distance.json/" + zip1 + "/" + zip2 + "/km";
		String url1 = "https://www.zipcodeapi.com/rest/"+ API_Key +"/info.json/" + zip1 +"/degrees";
		String inputLine;
		try {
			URL ur = new URL(url1);
			HttpURLConnection con = (HttpURLConnection) ur.openConnection();
			con.setRequestMethod("GET");
			BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			inputLine = reader.readLine();
			JSONObject json = new JSONObject(inputLine);
			String city = json.getString("city");
			//String state = json.getString("state");
			return city ;
		} catch (Exception e) {
			return null;
		}
	}
		public String getstate(String zip1) {
			String API_Key = "gfxeiptpyQZMuTWQisQItZDXgVtHCNTT3r7mRBMprLbWF8NXBDG4Ck2TfvASjuLn";
			//String url = "https://www.zipcodeapi.com/rest/" + API_Key + "/distance.json/" + zip1 + "/" + zip2 + "/km";
			String url1 = "https://www.zipcodeapi.com/rest/"+ API_Key +"/info.json/" + zip1 +"/degrees";
			String inputLine;
			try {
				URL ur = new URL(url1);
				HttpURLConnection con = (HttpURLConnection) ur.openConnection();
				con.setRequestMethod("GET");
				BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
				inputLine = reader.readLine();
				JSONObject json = new JSONObject(inputLine);
				//String city = json.getString("city");
				String state = json.getString("state");
				return state ;
			} catch (Exception e) {
				return null;
			}
	}
	public static void main(String args[]) {System.out.println("Enter Zip code");
	String zip;
	Scanner s = new Scanner(System.in);
	DNA ncop = new DNA();
	while (s.hasNext()) {
		zip = s.nextLine();
		if (zip.length() == 5) {
			System.out.println(ncop.getcity(zip));
			System.out.println(ncop.getstate(zip));
		//System.out.println("Enter CustomerID, Zip code");
	}
		else{
		System.out.println("Invalid zipcode");
		break;
	}
	s.close();
		
}
}
}

		
	


