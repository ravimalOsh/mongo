/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mongodb;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;


/**
 *
 * @author Ravimal
 */
public class DBManager {
	
	private static DB database;
	
	public static DB getDatabase() throws java.net.UnknownHostException {
		if(database == null) {
			MongoClient mongo;
			try {
				mongo = new MongoClient("localhost", 27017);
				database = mongo.getDB("usermanager");
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return database;
	}
}


