/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author caragea
 */
@XmlRootElement
public class Station {
    private String stationname;
    private int stationid, zone;

    public Station(String stationname, int stationid, int zone) {
        this.stationname = stationname;
        this.stationid = stationid;
        this.zone = zone;
    }

    public Station() {
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname;
    }

    public int getStationid() {
        return stationid;
    }

    public void setStationid(int stationid) {
        this.stationid = stationid;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

   
    
}
