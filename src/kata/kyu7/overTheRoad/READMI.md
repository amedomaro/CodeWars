#Over The Road
###Task

You've just moved into a perfectly straight street with exactly n identical 
houses on either side of the road. Naturally, you would like to find out the 
house number of the people on the other side of the street. The street looks 
something like this:
~~~~
1|   |6
3|   |4
5|   |2
~~~~
Evens increase on the right; odds decrease on the left. House numbers start 
at `1` and increase without gaps. When `n = 3`, `1` is opposite `6`, `3` 
opposite `4`, and `5` opposite `2`.

###Example

Given your house number address and length of street n, give the house number 
on the opposite side of the street.
~~~~
CodeWars.overTheRoad(long address, long n)
CodeWars.overTheRoad(1, 3) = 6
CodeWars.overTheRoad(3, 3) = 4
CodeWars.overTheRoad(2, 3) = 5
CodeWars.overTheRoad(3, 5) = 8
~~~~
If you are timing out, running out of memory, or get any kind of "error", 
read on. Both n and address could get upto 500 billion with over 200 random 
tests. If you try to store the addresses of 500 billion houses in a list 
then you will run out of memory and the tests will crash. This is not a 
kata problem so please don't post an issue. Similarly if the tests don't 
complete within 12 seconds then you also fail. 
