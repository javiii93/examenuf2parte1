package ejercicioMavenExamen;
// Generated 20-ene-2020 17:01:18 by Hibernate Tools 5.4.7.Final

/**
 * Class generated by hbm2java
 */
public class Class implements java.io.Serializable {

	private int classId;
	private String className;

	public Class() {
	}

	public Class(int classId, String className) {
		this.classId = classId;
		this.className = className;
	}

	public int getClassId() {
		return this.classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}
