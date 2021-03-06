package ot3.insa.fr.geodraw.models;

/**
 * Respresents  a single GPS fix
 * @author Max 
 */
public class LatLng {
    private final double lat;
    private final double lng;

    public LatLng(double lat, double lng)
    {
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat()
    {
        return lat;
    }

    public double getLng()
    {
        return lng;
    }
    
    

}
