package com.cloudcomputing.cloudkarma;

public class RemainingResources {

	public class FreeSpace {

		int cpu_avaliable;
		int memory_avaliable;

		@Override
		public String toString() {
			return "CPU avaliable:" + cpu_avaliable + "Memory Avaliable: " + memory_avaliable;

		}

	}

	String ec2InstanceId;
	String containerInstanceArn;
	int runningTasksCount;
	FreeSpace freeSpace = new FreeSpace();

	public RemainingResources(String ec2InstanceId, String containerInstanceArn, int runningTasksCount) {
		this.ec2InstanceId = ec2InstanceId;
		this.containerInstanceArn = containerInstanceArn;
		this.runningTasksCount = runningTasksCount;

	}

	public void setCpuAvaliable(int cpu_avaliable) {
		this.freeSpace.cpu_avaliable = cpu_avaliable;

	}

	public void setMemoryAvaliable(int memory_avaliable) {
		this.freeSpace.memory_avaliable = memory_avaliable;

	}

	@Override
	public String toString() {
		return "ec2InstanceId: " + ec2InstanceId + "containerInstanceArn: " + containerInstanceArn
				+ "runningTasksCount: " + runningTasksCount + "freeSpace: " + freeSpace;
	}

}
