package za.ac.cput.reminisce.Models;

public class Organizer extends Person{
    private long orgId;

    public long getOrgId() {
        return orgId;
    }

    public void setOrgId(long orgId) {
        this.orgId = orgId;
    }

    public Organizer() {
    }

    public Organizer(String name, String surname, String email, String password, long orgId) {
        super(name, surname, email, password);
        this.orgId = orgId;
    }

    @Override
    public String toString() {
        return "Organizer{" +
                "orgId=" + orgId +
                '}';
    }
}
