import java.util.HashMap;

public class IDandPasswords {
	private HashMap<String, String> logininfo = new HashMap<>();

	public IDandPasswords() {
		logininfo.put("Production", "Production");
		logininfo.put("Critic", "Critic");
	}

	protected HashMap getLogininfo() {
		return logininfo;
	}

	

}
