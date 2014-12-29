/**
 * 
 */
package com.harmeetsingh13.utility;

/**
 * @author Harmeet Singh(Taara)
 *
 */
public class CommonEnums {

	public enum ROLES{
		USER(1, "USER"), ADMIN(2, "ADMIN");

		private int id;
		private String name;
		private ROLES(int id, String name) {
			this.id = id;
			this.name = name;
		}
		
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
	}
}
