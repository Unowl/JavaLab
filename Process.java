package sql_lab_connect;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Process
{
	
	void day_in_room(String day_t, int room_t)
	{
		JDBC_connect app = new JDBC_connect();
	     try(Connection connect = app.connect())
	     {
	    	 String stat = "SELECT teachers.name, subjects.name as subject, reading.day,"
		    	 		+ "    reading.room, reading.st_num, reading.les_num"
		    	 		+ "    FROM teachers, subjects, reading"
		    	 		+ "    WHERE teachers.teacher_id = reading.teacher_id"
		    	 		+ "    AND subjects.subject_id = reading.subject_id"
		    	 		+ "    AND reading.day = '" + day_t+"'"
		    	 		+ "    AND reading.room = "+ room_t +";";
	    	 Statement stmt = connect.createStatement();

	    	 ResultSet resultSet = stmt.executeQuery(stat);
	    	 
	    	 System.out.println("name subject day room st_num sub_num");
	    	 
	    	 while(resultSet.next())
	    	 {
                 
	    		    String name = resultSet.getString("name");
	    		    String subject = resultSet.getString("subject");
	    		    String day_ = resultSet.getString("day");
	    		    int room_ = resultSet.getInt("room");
	    		    int st_num = resultSet.getInt("st_num");
	    		    int les_num = resultSet.getInt("les_num");
	    		                     
	    		   
	    		    System.out.println(name + " " + subject + " " + day_ + " " + room_ + " " + st_num + " " + les_num);
	    	}
	    	 
	     } catch (SQLException e) 
	     {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }

	}
	
	void not_day(String day_t)
	{
		JDBC_connect app = new JDBC_connect();
	     try(Connection connect = app.connect())
	     {
	    	 String stat = "SELECT teachers.name, subjects.name as subject, reading.day,"
		    	 		+ "    reading.room, reading.st_num, reading.les_num"
		    	 		+ "    FROM teachers, subjects, reading"
		    	 		+ "    WHERE teachers.teacher_id = reading.teacher_id"
		    	 		+ "    AND subjects.subject_id = reading.subject_id"
		    	 		+ "    AND reading.day != '" + day_t+"';";

	    	 Statement stmt = connect.createStatement();

	    	 ResultSet resultSet = stmt.executeQuery(stat);
	    	 
	    	 System.out.println("name subject day room st_num sub_num");
	    	 
	    	 while(resultSet.next())
	    	 {
                 
	    		    String name = resultSet.getString("name");
	    		    String subject = resultSet.getString("subject");
	    		    String day_ = resultSet.getString("day");
	    		    int room_ = resultSet.getInt("room");
	    		    int st_num = resultSet.getInt("st_num");
	    		    int les_num = resultSet.getInt("les_num");
	    		                     
	    		   
	    		    System.out.println(name + " " + subject + " " + day_ + " " + room_ + " " + st_num + " " + les_num);
	    	}
	    	 
	     } catch (SQLException e) 
	     {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }

	}
	
	void les_num(int les_num)
	{
		JDBC_connect app = new JDBC_connect();
	     try(Connection connect = app.connect())
	     {
	    	 String stat = "SELECT * FROM "
	    	 		+ "(SELECT reading.day, SUM(les_num) "
	    	 		+ "FROM reading "
	    	 		+ "GROUP BY reading.day) AS tmp WHERE sum = "+ les_num+ ";";

	    	 Statement stmt = connect.createStatement();

	    	 ResultSet resultSet = stmt.executeQuery(stat);
	    	 
	    	 System.out.println("day sum");
	    	 
	    	 while(resultSet.next())
	    	 {
                 
	    		    String day = resultSet.getString("day");
	    		    int sum = resultSet.getInt("sum");
	    		                     
	    		   
	    		    System.out.println(day + " " + sum);
	    	}
	    	 
	     } catch (SQLException e) 
	     {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }

	}
}
