
public class Admin extends User{

	public Admin(){
		isAdmin = true;
	}
	
	public Admin(String firstName, String lastName, String address, int zipCode, String stateOfResidence, 
			String username, String password, String email, long ssn, String recoveryQuestion) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.zipCode = zipCode;
		this.stateOfResidence = stateOfResidence;
		this.username = username;
		this.password = password;
		this.email = email;
		this.ssn = ssn;
		this.recoveryQuestion = recoveryQuestion;
		this.isAdmin = true;
	}
	
	@Override
	public void createUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAdmin() {
		// TODO Auto-generated method stub
		return isAdmin;
	}
	protected String getFirstName() {
		return firstName;
	}


	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	protected String getLastName() {
		return lastName;
	}


	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}


	protected String getAddress() {
		return address;
	}


	protected void setAddress(String address) {
		this.address = address;
	}


	protected int getZipCode() {
		return super.zipCode;
	}


	protected void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}


	protected String getStateOfResidence() {
		return stateOfResidence;
	}


	protected void setStateOfResidence(String stateOfResidence) {
		this.stateOfResidence = stateOfResidence;
	}


	protected String getUsername() {
		return username;
	}


	protected void setUsername(String username) {
		this.username = username;
	}


	protected String getPassword() {
		return password;
	}


	protected void setPassword(String password) {
		this.password = password;
	}


	protected String getEmail() {
		return email;
	}


	protected void setEmail(String email) {
		this.email = email;
	}


	protected long getSsn() {
		return ssn;
	}


	protected void setSsn(long ssn) {
		this.ssn = ssn;
	}


	protected String getRecoveryQuestion() {
		return recoveryQuestion;
	}


	protected void setRecoveryQuestion(String recoveryQuestion) {
		this.recoveryQuestion = recoveryQuestion;
	}

}
