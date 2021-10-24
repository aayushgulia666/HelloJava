Thread_Priorities.md

@author = Aayush Gulia
@email = aayushgulia07@outlook.com
@dated : 24-10-2021 22:22:56

1> Java supports thread priorities from 1 to 10.

2> Execution of thread depends upon scheduler.

3> Higher priority means higher preference. If a thread is having a higher priority then it should get some higher preference.

4> In java there are 3 different types of priority : 
			MIN_PRIORITY = 1
			NORM_PRIORITY = 5
			MAX_PRIORITY = 10

EXAMPLE:
	
	In MS-word one thread takes input from the keyboard, another thread checks for the spelling which works simultaneously another thread which works to auto-save the document.

	In the above the most priority is given to the thread which takes input.

5> The priority of default thread is always 5. i.,e NORM_PRIORITY.

6> The higher priority is given to the thread which gets the input or get the data.

7> The thread with higher priority gets the higher CPU time.

8> Multi threading features are provided by the operating system, but in java JVM has it's own  
   scheduler.