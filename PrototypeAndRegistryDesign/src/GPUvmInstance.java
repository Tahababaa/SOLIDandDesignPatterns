public class GPUvmInstance extends VMinstance{
    private String gpuName;

    public GPUvmInstance(String os, String runtime, String hostname, String monitoringAgent, String ipAddress, String gpuName) {
        super(os, runtime, hostname, monitoringAgent, ipAddress);
        this.gpuName = gpuName;
    }


    public GPUvmInstance(GPUvmInstance other) {
        super(other);
        this.gpuName = other.gpuName;
    }
    public String getGpuName(){
        return this.gpuName;
    }
    @Override
    public GPUvmInstance clone(){
        return new GPUvmInstance(this);
    }
}
