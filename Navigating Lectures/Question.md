Due to the pandemic situation, universities are struggling to resume normal operation by bringing back students onto campus for physical activities. At a certain university, they have employed a mixed-model where students can either attend physical or online classes on a particular week.

However, to encourage students to join some physical activities - otherwise fearing that every student may join all the lessons online from their homes - and still ensure that they do not overcrowd the university by everyone coming at once, they have the following rules in place:

An online session must always be followed by a physical session in the next week - i.e. if a student joins an online session on week X, they must join a physical session on week (X+1)
A student can come physically for a maximum of two consecutive weeks - i.e. if they come for physical sessions for two continuous weeks (say Week X, and Week X+1), then the following week (Week X+2) they must join online
Marks are awarded (as a part of continuous assessment) for attending a session either physically or online each week
e.g. assuming a 10-week semester, the marks allocated are
10, 6, 16, 6, 20, 6, 6, 10, 10, 16
full marks are awarded for physical attendance, and half the marks for online
the student can attend the first week physically or online
Write a program that, given the mark allocation for each week, maximises the sum of marks gained, without violating the rules.

Input Format

the first line contains a single integer N, the number of weeks in a semester
the next contains N even integers (X), seperated by spaces
Constraints

2 <= N <= 100,000
1 <= X <= 100, X will be even
Output Format

a single integer: the maximum mark a student could gain by navigating this system
Sample Input 0

10
10 6 16 6 20 6 6 10 10 16
Sample Output 0

92