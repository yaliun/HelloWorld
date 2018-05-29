package net.yaliun.vo;

public class User {
	public enum Gender{MALE, FEMAIL};
	
	public static class Name{
		private String _first, _last;

		public String getFirst() {
			return _first;
		}
		public String getLast() {
			return _last;
		}
		public void setFirst(String s) {
			this._first = s;
		}
		public void setLast(String s) {
			this._last = s;
		}
		
		private Gender _gender;
		private Name _name;
		private boolean _isVerified;
		private byte[] _userImage;

		public Gender getGender() {
			return _gender;
		}
		public void setGender(Gender g) {
			this._gender = g;
		}
		public Name getName() {
			return _name;
		}
		public void setName(Name n) {
			this._name = n;
		}
		public boolean isVerified() {
			return _isVerified;
		}
		public void setVerified(boolean b) {
			this._isVerified = b;
		}
		public byte[] getUserImage() {
			return _userImage;
		}
		public void setUserImage(byte[] b) {
			this._userImage = b;
		}		
	}
}
