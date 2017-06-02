# TrieDataStructure

## Problem:
#### Input: <br>
Electronics <br>
Electronics > Arcade Equipment <br> 
Electronics > Arcade Equipment > Basketball Arcade Games <br> 
Electronics > Arcade Equipment > Pinball Machine Accessories <br> 
Electronics > Arcade Equipment > Pinball Machines <br> 
Electronics > Arcade Equipment > Skee-Ball Machines <br> 
<br>
Queries: <br> 
Electronics = 14 <br> 
Electronics > Arcade Equipment = 7 <br> 
Electronics > Arcade Equipment > Video Game Arcade Cabinets = 1 <br> 
Electronics > Arcade Equipment > Skee-Ball Machines = 1 <br>
<br>
Given an input file in the format shown above, build the data structure to store the information in a way to answer the queries of above type.
<br>
### Solution: <br>
The proposed solution uses modified Trie data structure for storing above data. Where every Node stores <br>
##### A String,<br>
##### List of Childrens,<br>
##### Reference to Parent Node,<br>
##### Count<br>
