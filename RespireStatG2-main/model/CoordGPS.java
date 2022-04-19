package model;

public class CoordGPS {
	private double latitude;
	private double longitude;
	
	public CoordGPS(String geometry) {
		this(getLatitudeFromGeometry(geometry),getLongitudeFromGeometry(geometry));
	}
	public CoordGPS(double lat, double lon) {
		latitude = lat;
		longitude = lon;
	}
	
	private static String[] extractLatLongFromGeometry(String geometry) {
		String extract = geometry.substring(2, geometry.length()-1);
		String[] coord = extract.split(", ");
		return coord;
	}
	private static double getLatitudeFromGeometry(String geometry) {
		return Double.parseDouble(extractLatLongFromGeometry(geometry)[0]);
	}
	private static double getLongitudeFromGeometry(String geometry) {
		return Double.parseDouble(extractLatLongFromGeometry(geometry)[1]);
	}
	public double getLatitude() {
		return latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	
	public double getDistance() {
        double latDeParis = 48.8536169894676;
        double longDeParis = 2.348761269654609;

        final int R = 6371;
            
        double latDistance = toRad(getLatitude()-latDeParis);
        double lonDistance = toRad(getLongitude()-longDeParis);
        
        double lat = getLatitude();
        latDeParis = toRad(latDeParis);
        double lon = getLongitude();
            
        
        double a = haversin(latDistance) + Math.cos(latDeParis) * Math.cos(lat) * haversin(lonDistance);
        final double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        
        double distance = R * c;
        
        return distance;
        
    }
	
	private static Double toRad(Double value) {
		return value * Math.PI / 180;
	}
	
	public static double haversin(double val) {
        return Math.pow(Math.sin(val / 2), 2);
	}

	
	@Override
	public String toString() {
		return "CoordGPS [latitude=" + latitude + ", longitude=" + longitude + "]";
	}

	
}
