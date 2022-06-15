/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;


import Controllers.JDBCHandeller;
import Models.Station;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author caragea
 */
@Path("Facade.Stations")
public class StationsFacade {
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Station> getStations()
    {
        Connection con = JDBCHandeller.getConnection();
        ArrayList<Station> stations = new ArrayList<>();
        try{
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM stations");
            while(result.next())
            {
                Station station = new Station(result.getString("station_name"), result.getInt("station_id"), result.getInt("zone"));
                stations.add(station);
            }
            return stations;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return null;
    }
    
}
