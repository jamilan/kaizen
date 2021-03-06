package kaizen.plugins.vs2010

import java.security.MessageDigest

class GuidString {
	static def from(String s) {
		"{${uuidFrom(s).toString().toUpperCase()}}"
	}

	static def uuidFrom(String s) {
		new UUID(MessageDigest.getInstance("MD5").digest(s.bytes))
	}
}
