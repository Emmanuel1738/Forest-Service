package models;

/*
public class DB {
     public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker2", "moringa", "Emmanuel1738");
}
*/

import org.sql2o.Sql2o;

public class DB {
     public static String connectionString = "jdbc:postgresql://ec2-34-235-62-201.compute-1.amazonaws.com:5432/dftdbh9698l7s0";
     public static Sql2o sql2o = new Sql2o(connectionString,"aaxdbnmafohegw","8d31bf1721ec73bd42814b07623837561460f79ef8b475df0608ec034a1ed223");

}