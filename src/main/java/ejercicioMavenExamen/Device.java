package ejercicioMavenExamen;
// Generated 20-ene-2020 17:01:18 by Hibernate Tools 5.4.7.Final

/**
 * Device generated by hbm2java
 */
public class Device implements java.io.Serializable {

	private int deviceId;
	private String name;

	public Device() {
	}

	public Device(int deviceId, String name) {
		this.deviceId = deviceId;
		this.name = name;
	}

	public int getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
