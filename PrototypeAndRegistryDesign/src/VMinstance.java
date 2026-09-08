import java.util.ArrayList;
import java.util.List;

public class VMinstance implements Prototype<VMinstance>{

    private String os;
    private String runtime;
    private String monitoringAgent;
    private String hostname;
    private String ipAddress;
    private List<String> installedInstances;

    public VMinstance(String os, String runtime, String hostname, String monitoringAgent, String ipAddress) {
        this.os = os;
        this.runtime = runtime;
        this.hostname = hostname;
        this.monitoringAgent = monitoringAgent;
        this.ipAddress = ipAddress;
        this.installedInstances = new ArrayList<>();
    }
    public VMinstance(VMinstance  other) {
        this.hostname = other.hostname;
        this.monitoringAgent = other.monitoringAgent;
        this.runtime = other.runtime;
        this.ipAddress = other.ipAddress;
        this.os = other.os;
        this.installedInstances = new ArrayList<>(other.installedInstances); // shallow copy but for strings deep copy
    }

    public String getOs() {
        return os;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getMonitoringAgent() {
        return monitoringAgent;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public List<String> getInstalledInstances() {
        return installedInstances;
    }

    @Override
    public VMinstance clone() {
        return new VMinstance(this);
    }
}
