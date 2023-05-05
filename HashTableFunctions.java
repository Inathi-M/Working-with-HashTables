class HashTableFunctions
{
   // hash function weights
   // 9 integers, each in the range 0-5 to act as weights for the characters in the keys
   int [] weights = {4,2,0,3,1,0,1,2,4};
   // ADD YOUR WEIGHTS INSTEAD OF 1s

   // returns True if the hash table contains string s
   // return False if the hash table does not contain string, s
   boolean find ( String s, int h, int hashTableSize, String [] hashTableArray )
   {
      // WRITE YOUR CODE HERE
	 //  int hash = h(s);
		int iValue= h;
		while(! hashTableArray[h].equals (""))
		{
			if (hashTableArray[h].equals (s))
			{
				return true;
			}
			
			else
			{
				h = (h + 1) % hashTableSize;
				if (h == iValue)
				{
					return false;
				}
			}
		}
		return false;
		
   }
}
