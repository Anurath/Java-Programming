class LeetCodeSolution_Q2651{
	//Q.2651
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (byte)(arrivalTime+delayedTime)%24;
    }
}