/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ot3.insa.fr.geodraw.models;


/**
 *
 * @author maex
 */
public class GeoDrawModel
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Segment segment1 = new Segment();
        segment1.addLatLng(new LatLng(0.234534, 0.234523));
        segment1.addLatLng(new LatLng(0.23452345, 0.234523));
        segment1.addLatLng(new LatLng(0.2323434, 0.45623));
        segment1.addLatLng(new LatLng(0.45645, 0.678));

        Segment segment2 = new Segment();
        segment2.addLatLng(new LatLng(0.7654534, 0.67234523));
        segment2.addLatLng(new LatLng(0.567452345, 0.67234523));
        segment2.addLatLng(new LatLng(0.456323434, 0.8745623));
        segment2.addLatLng(new LatLng(0.5578645, 0.567678));
        
        Drawing trace = new Drawing();
        trace.addSegment(segment1);
        trace.addSegment(segment2);

    }

}
