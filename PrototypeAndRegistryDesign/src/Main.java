//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// -------------------------------
        // 1. Create a VM prototype
        // -------------------------------
        VMinstance vm = new VMinstance(
                "Linux",
                "Java 21",
                "server-01",
                "Prometheus",
                "192.168.1.10"
        );

        vm.getInstalledInstances().add("Java");
        vm.getInstalledInstances().add("Docker");

        // -------------------------------
        // 2. Clone the VM
        // -------------------------------
        VMinstance clonedVm = vm.clone();

        System.out.println("Original hostname: " + vm.getHostname());
        System.out.println("Cloned hostname:   " + clonedVm.getHostname());

        // Change clone
        clonedVm.setHostname("server-02");

        System.out.println("\nAfter changing clone:");
        System.out.println("Original hostname: " + vm.getHostname());
        System.out.println("Cloned hostname:   " + clonedVm.getHostname());

        // Check different objects
        System.out.println("\nAre they same object? " + (vm == clonedVm));


        // -------------------------------
        // 3. Test installedInstances
        // -------------------------------
        System.out.println("\nOriginal installed instances: "
                + vm.getInstalledInstances());

        System.out.println("Cloned installed instances:   "
                + clonedVm.getInstalledInstances());


        // -------------------------------
        // 4. Create GPU VM
        // -------------------------------
        GPUvmInstance gpuVm = new GPUvmInstance(
                "Linux",
                "Java 21",
                "gpu-server-01",
                "Prometheus",
                "192.168.1.20",
                "NVIDIA RTX 4090"
        );

        // -------------------------------
        // 5. Clone GPU VM
        // -------------------------------
        GPUvmInstance clonedGpuVm = gpuVm.clone();

        System.out.println("\nGPU VM:");
        System.out.println("Original GPU: " + gpuVm.getGpuName());
        System.out.println("Cloned GPU:   " + clonedGpuVm.getGpuName());

        System.out.println(
                "Are GPU VMs same object? " + (gpuVm == clonedGpuVm)
        );


        // -------------------------------
        // 6. Test Registry
        // -------------------------------
        Registry registry = new InstanceRegistry();

        registry.add("basic", vm);
        registry.add("gpu", gpuVm);

        // Get cloned objects from registry
        VMinstance basicClone = registry.getValue("basic");
        VMinstance gpuClone = registry.getValue("gpu");

        System.out.println("\nRegistry test:");

        System.out.println("Basic clone hostname: "
                + basicClone.getHostname());

        System.out.println("GPU clone hostname: "
                + gpuClone.getHostname());

        System.out.println("GPU clone class: "
                + gpuClone.getClass().getSimpleName());


        // -------------------------------
        // 7. Verify registry returns clones
        // -------------------------------
        System.out.println("\nRegistry clone test:");

        System.out.println(
                "basicClone == vm: " + (basicClone == vm)
        );

        System.out.println(
                "gpuClone == gpuVm: " + (gpuClone == gpuVm)
        );

    }
}