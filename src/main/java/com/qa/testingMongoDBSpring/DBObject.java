package com.qa.testingMongoDBSpring;

import javax.validation.constraints.Email;

import org.springframework.data.annotation.Id;

public class DBObject {

		@Id
		private String id;
		
		@Email
		private String eMail;
		
		private boolean admin;
		
		
		public DBObject() {}
		
		public DBObject(String incemail, boolean incAdmin) {
			this.eMail = incemail;
			this.admin = incAdmin;
		}

		public String getId() {
			return id;
		}

		public String geteMail() {
			return eMail;
		}
		
		public void seteMail(String incemail) {
			this.eMail = incemail;
		}

		public boolean getAdmin() {
			return admin;
		}

		public void setAdmin(boolean admin) {
			this.admin = admin;
		}
}
