package com.cloudcomputing.cloudkarma;

import lombok.Data;
import lombok.ToString;

@ToString(includeFieldNames = true)
@Data
public class RemainingResources {

	@ToString(includeFieldNames = true)
	@Data
	public class FreeSpace {
		int cpuAvailable;
		int memoryAvailable;
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

	public void setCpuAvaliable(int cpuAvailable) {
		this.freeSpace.cpuAvailable = cpuAvailable;
	}

	public void setMemoryAvaliable(int memoryAvailable) {
		this.freeSpace.memoryAvailable = memoryAvailable;
	}
}
