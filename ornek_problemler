
https://www.includehelp.com/tips/c/
https://www.includehelp.com/icp/
Programlama ile ilgili örnek problemler;
	1) Run-length encoding (find/print frequency of letters in a string)
		Here, we are going to learn how to find/print the frequency of letters in a string using run-lentgh encoding?
		Submitted by Radib Kar, on November 17, 2018

		Problem description

		Write a program that counts frequency of each letter in the string (string consists lowercase letters only).
		
	2){Sort an array of 0's, 1's and 2's in linear time complexity
			Here, we are going to learn how to sort an array of 0's, 1's and 2's linear time complexity using C++ programming code?

		Description:
		//0,1 ve 2' lerden oluşan bir diziyi sıralamak isteniyor. 0' lar en başta, ortada 1' ler ve en sonda da 2' ler olacak şekilde sıralamak istiyoruz.
		Solution to the coding problem of sorting an array of 0's, 1's and 2's in linear time complexity.
		
		Problem statement:
		
		Given an array consisting only 0's, 1's and 2's. Give an algorithm for sorting the array in O(n) time complexity ( in the sorted array, 0's will be at starting ,then the 1's & then the 2's).
		
		Örnek:
			dizi uzunluğu n = 10
			input dizisi : 0 2 2 1 1 1 2 1 2 1
			Output dizisi : 0 1 1 1 1 1 2 2 2 2 

		
		Solution:
		Algorithm
		
		Set three variables low=0,mid=0, high=n-1 where n=length of input array
		While (mid<=high), consider three cases on basis of the value of array [mid].
		If array[mid] is 0
		Swap (array [low], array [mid]) since 0's should be at starting
		Increment low
		Increment mid
		Break statement
		If array[mid] is 1
		Keep as it is since 1's should be at middle after being sorted
		Increment mid
		Break statement
		If array[mid] is 2
		Swap (array [mid], array [high])
		Decrement high
		Break statement
		Resulting array is sorted.
		
		Code Solution;
			#include<stdio.h>
			#include<stdlib.h>
			
			//function to swap by reference
			void swap(int*a,int*b){
				int temp;
				temp=*b;
				*b=*a;
				*a=temp;
				return;
			}
			int* asort(int *a,int n){
				int low=0,mid=0,high=n-1;   //variables are set
				
				while(mid<=high){
					switch(a[mid]){
						case 0:     //if a[mid]==0
							//swap a[low] & a[mid], swapping by reference
							swap(&a[low],&a[mid]);  
							low++;      //increment low
							mid++;      //increment mid
							break;
						case 1:     //if a[mid]==1
							mid++;      //increment mid
							break;
						case 2:     //if a[mid]==2
							//swap a[mid] & a[high], swapping by reference
							swap(&a[mid],&a[high]);  
							high--;     //decrement high
							break;
					}
				}
				//returning adress of array(sorted)
				return a;   
			}
			
			int main() {
				int n;
			
				printf("enter no of array elements\n");
				//input array length
				scanf("%d",&n);
			
				int* a=(int*)malloc(sizeof(int)*n);
			
				printf("enter array elements\n");
				//input array elements
				for(int j=0;j<n;j++)      
					scanf("%d",&a[j]);
				//array is modified
				a=asort(a,n);   
				printf("after being sorted..............\n");
				//printing the sorted array
				for(int j=0;j<n-1;j++)   
					printf("%d ",a[j]);
				
				printf("%d\n",a[n-1]);
			
				return 0;
			}
}
	3){Checking Anagrams (check whether two string is anagrams or not)
			Checking Anagrams: In the following we are going to learn how to check whether two string is anagrams or not?
		
		Problem statement: Given two strings, check whether two given strings are anagram of each other or not. An anagram of a string is another string that contains same characters, only the order of characters can be different.
		
		For example, "act" and "cat" are anagram of each other.
		
		Solution
		
		Algorithm:
		
		Anagram means both the string contains the same set of character, only their orders are different. Thus, in both the string the frequency of each letter must be the same if they are an anagram of each other. Thus our algorithm checks and compare frequency of each letter in both the strings.
		
		The strings to be anagram of each other, their length must be same.
		Let n1 be the length of first string & n2 be the length of second string.
		If (n1!=n2)
			Strings are not anagram. Return.
		Else
		Proceed to step2.
		Initialize two arrays of length 26 to store frequency of characters in each string.
		array1[26]={0}, array2[26]={0};
		//for the first string
		For i=1:n1 //n1 be the length of first string
			// for each letter of the string their corresponding
			array1[string1[i]-'a']++; 
		//frequencies are being stored
		
		End for loop
		
		//for the second string
		For i=1:n2 //n2 be the length of second string
			// for each letter of the string their corresponding
			array2[string2[i]-'a']++; 
		//frequencies are being stored
		
		End for loop
		Comparison step
		Compare the frequency of each letter in both the strings
		If 
		all the letter in both of the string have same frequency (number of occurrence)
		Then they are anagrams of each other
		Else
		They are not anagrams of each other
		Print result and return.
		
		
		Code Solution
		#include <bits/stdc++.h>
		using namespace std;
		
		int anagram(string s1,string s2){
			int array1[26]={0},array2[26]={0};
			//if string lengths are different
			if(s1.length()!=s2.length())
				return 0; //they are not anagrams
			//for string1
			for(int i=0;s1[i]!='\0';i++){
				//storing frequency for each letter in the string   
				array1[s1[i]-'a']++;     
			}
		
			//for string2
			for(int i=0;s2[i]!='\0';i++){
				//storing frequency for each letter in the string     
				array2[s2[i]-'a']++;   
			}
			//comparison step
			for(int i=0;i<26;i++){
				// if any letter has different no of occurence, 
				// then strings are not anagrams
				if(array1[i]!=array2[i]) 
					return 0;
			}
		
			return 1;// else they are anagrams
		}
		int main()
		{
			int n;
			string s1,s2;
		
			//input the strings
			cout<<"enter string1\n";
			cin>>s1;
			cout<<"enter string2\n";
			cin>>s2;
		
			if(anagram(s1,s2))
				printf("strings are anagrams of each other\n");
			else
				printf("strings are not anagrams of each other\n");
		
			return 0;
		}
		}
	4){Relative sorting algorithm
		In this article, we are going to learn relative sorting along with its algorithm, C++ program.
		
		
		Description: This a coding problem came in the coding round of Amazon, Microsoft.
		
		Problem Statement:
		
		Given two array A and B, sort A in such a way that the relative order among the elements will be the same as those in B. For the elements not present in B, append them at last in sorted order. It is also given that the number of elements in B is smaller than or equal to the number of elements in A and B has all distinct elements.
		
		Solution
		
		Algorithm:
		
		To solve the above problem vector is used to implement the arrays.
		Initialize three vectors.
		Vector<int> a: for array A
		Vector<int> b: for array B
		Vector<int> c: for output array (relatively sorted array)
		Take input for array A and B
		Sort vector a using in-build sorting function.
		For sorting the elements of a according to order of b,
		For i=0:n2-1      //n2 be the no of elements of B&n1 of A
			For  j=0:n1-1 && a[j]<=b[i]    //maintaining the order of b
				if(a[j]==b[i])
					inserta[j] into c;
					Set a[j] to 0 for avoiding duplication
				End if
			End For loop
		End For loop
		The elements of vector a, also presented in vector b are sorted according to relative order of vector b. The rest of vector a is to be appended at the end of vector c in sorted way.
		Just appended the rest of elements of vector a in vector c. (elements those are not zero).
		vector c is the desired output.
		Örnek:
			enter length of array A & B respectively 
				10 
				5
				enter elements of array A
				2 5 12 2 8 9 13 5 8 12 
				enter elements of array B
				5 2 8 12 9 
				printing the relatively sorted array 
				5 5 2 2 8 8 12 12 9 13 
		
		#include <bits/stdc++.h>
		using namespace std;

		vector<int> sorted(vector<int> a,vector<int> b,int n1,int n2){
			vector <int> c;
			// array a is sorted using labrary sorting function
			sort(a.begin(),a.end()); 

			for(int i=0;i<n2;i++){
				for(int j=0;j<n1 && a[j]<=b[i];j++){
					// elements of sorted a is entered to array c 
					// maintaing the element order as in b
					if(a[j]==b[i]){
						c.push_back(a[j]);
						//clear the element pushed into c
						a[j]=0;
					}
				}
			}

			// the elements that are not in b is in being entered to c 
			// in sorted manner as a is already sorted
			for(int i=0;i<n1;i++)  
				if(a[i]!=0)    //remaining elements of a
					c.push_back(a[i]);
					
			//return the output
			return c; 
		}


		int main() {
			int n1,n2,u;
			vector<int> :: iterator p; //iterator p

			scanf("%d %d",&n1,&n2);

			vector<int> a; //array a
			vector<int> b;//array b

			for(int j=0;j<n1;j++){
				scanf("%d",&u);
				// inputing elements of array a
				a.push_back(u); 
			}
			for(int j=0;j<n2;j++){
				scanf("%d",&u);
				// inputing elements of array b
				b.push_back(u);  
			}

			// implemented relative sorting function
			vector<int> c=sorted(a,b,n1,n2); 
			for(p=c.begin();p!=c.end();p++)	
				printf("%d ",*p);  // printing the sorted array
			printf("\n");

			return 0;
		}

	}
	5){Finding subarray with given sum
	In the article, we are going to find a subarray which sums to an input sum. This problem came in coding round of Visa, Amazon.
	Submitted by Radib Kar, on November 22, 2018

	Problem Statement: Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to the given number.

	Solution

	Algorithm:

	A in the input array, n is the length of the array & s in the given sum.
	Initialize vector b. (for storing indexes of subarray)
	Initialize a variable cur_sum=0
	for i=0:n-1
		set cur_sum=A[i]
		for j=i+1:n-1
			add A[j] to cur_sum
			if(cur_sum==s)
				i is the starting index of subarray found
				j is the end index of subarray found
				print elements between indexes i & j
				(including i & j) & return to main
			end if
			if cur_sum become greater than s then break loop
		end for
	end for
	If control comes out of the loop that means so such subarray exists, thus print "no subarray found".
	
	Output

		First run:
		enter array length & Sum respectively
		8
		20 
		enter array elements........ 
		4		2		10 		3		-3 		10 		5		5
		Subarray is: 10 3 -3 10 
		
		
		Second run:
		enter array length & Sum respectively
		6
		15 
		enter array elements........ 
		5		1		-6 		7		7		3
		subarray not found
		
	#include <bits/stdc++.h>
using namespace std;

vector<int> find(vector<int> a,int n,int s){
	vector<int> b; //output vector
	int cur_sum=0;
	for(int i=0;i<n;i++){
		cur_sum=a[i];//cur_suming element
		for(int j=i+1;j<n;j++){
			//add next element contigeously 
			cur_sum=cur_sum+a[j]; 
			// if current sum  is eaqual to the sum value
			if(cur_sum==s){ 
				//insert array index of the cur_sum element in sub array
				b.push_back(i); 
				//insert array index of the last element in sub array
				b.push_back(j); 
				return b;
			}
			if(cur_sum>s)
				break;
		}
	}
	// if no such sub array exists
	b.push_back(-1); 
	return b;
} 

int main() {
	//code
	int s,n,no;
	cout<<"enter array length & Sum respectively"<<endl;
	scanf("%d%d",&n,&s);

	vector<int> a; //input array

	cout<<"enter array elements........"<<endl;
	for(int j=0;j<n;j++){
		scanf("%d",&no);
		a.push_back(no); //inserting array elements
	}

	vector<int> b=find(a,n,s);
	if(b[0]==-1)
		printf("subarray not found");
	else{
		cout<<"Subarray is: ";
		for(int i=b[0];i<=b[1];i++)
			cout<<a[i]<<" ";
		cout<<endl;
	}	    
	return 0;
}

	
	}
	6){Find the level in a binary tree with given sum K
	Here, we are going to learn how to find the level in a binary tree with given sum K – its an interview coding problem came in Samsung, Microsoft?
Submitted by Radib Kar, on November 25, 2018

Description:

The article describes how to find the level in a binary tree with given sum K? This is an interview coding problem came in Samsung, Microsoft.

Problem statement:

Given a binary tree and an integer K, output the level no of the tree which sums to K. Assume root level is level 0.

Solution

Algorithm:

One of the popular traversal techniques to solve this kind of problems is level order tree traversal (Read more: Level Order Traversal on a Binary Tree) where we use the concept of BFS with some modifications.

1.	Set a variable level=0 & declare a variable of type tree* named temp. level is a flag for the current level & temp stores tree node to be processed.

2.	Set cur_sum=0

3.	if(!root) // root is NULL
return -1; //no such level exists

4.	q=createQueue() //to store pointers to tree node

5.	EnQueue(q,root);

6.	EnQueue(q,NULL);

Every time, we EnQueue a NULL to reflect the end of current level. Same way while processing when NULL is found, it reveals that end of current level.

7. while( q is not empty)
    temp=DeQueue(q);
    if(temp==NULL){ //end of current level
        if (cur_sum==K) // current level sum is equal to K
            Return level; //return level no (root is at 0 level)
        else {
            Set cur_sum =0; // for next level
            If(q is not empty)
                // to reflect end of next level which 
                // will be processed in next iteration
                EnQueue(q,NULL)
            Increase level //increase level count
        }
    }
    Else{
        cur_sum+=temp->data; //sum the level
        //do level order traversal
        If(temp->left)
            EnQueue(temp->left);
        If(temp->right)
            EnQueue (temp->right);
        }
End while loop
8. If program control comes out of while loop then surely no level has a sum K. Thus print no level has sum K

tree image 1
Example:

Here the level sums are:
For level 0: 2
For level 1: 12
For level 2: 17
For level 3: 20
Thus if K is 12 our program will print level 1


		Output:
		First run:
		Tree is built like the example aforesaid 
		input K..... 
		20 
		finding if any level exists......
		level is found and it is level 3 

		Second run:
		Tree is built like the example aforesaid 
		input K..... 
		25 
		finding if any level exists......
		level not found, no such tree level exists
		
		#include <bits/stdc++.h>
using namespace std;

// tree node is defined
class tree{
	public:
		int data;
		tree *left;
		tree *right;
};

int findLevel( tree *root,int K){
	queue<tree*> q;  // using stl
	tree* temp;
	//counting level no & initializing cur_sum
	int level=0,cur_sum=0; 
	//EnQueue root
	q.push(root); 
	//EnQueue NULL to inticate end of 0 level
	q.push(NULL);
	while(!q.empty()){
		//DeQueueing using STL
		temp=q.front(); 
		q.pop();
		if(temp==NULL){
			//if current level sum equals to K
			if(cur_sum==K) 
				return level;//return level no
			//ifn't then set cur_sum to 0 for further levels
			cur_sum=0; 
			if(!q.empty())
				q.push(NULL);
			level++;
		}
		else{
		//level order traversal
		cur_sum+=temp->data; //sum thd level
		if(temp->left)
			q.push(temp->left); //EnQueue
		if(temp->right)
			q.push(temp->right); //EnQueue
		}
	}
	return -1;
}

// creating new node
tree* newnode(int data)  
{ 
	tree* node = (tree*)malloc(sizeof(tree)); 
	node->data = data; 
	node->left = NULL; 
	node->right = NULL; 

	return(node); 
} 

int main() 
{ 
	//**same tree is builted as shown in example**
	int c,K;
	cout<<"Tree is built like the example aforesaid"<<endl;
	cout<<"input K....."<<endl;
	cin>>K;

	tree *root=newnode(2); 
	root->left= newnode(7); 
	root->right= newnode(5); 
	root->right->right=newnode(9);
	root->right->right->left=newnode(4);
	root->left->left=newnode(2); 
	root->left->right=newnode(6);
	root->left->right->left=newnode(5);
	root->left->right->right=newnode(11);

	cout<<"finding if any level exists......"<<endl; 
	c=findLevel(root,K);
	if(c>=0)
		cout<<"level is found and it is level "<<c<<endl;
	else
		cout<<"level not found, no such tree level exists";

	return 0; 
} 

	}				
	7){Check whether a Binary Tree is BST (Binary Search Tree) or not
	Here, we are going to learn how to check whether a give binary tree is a binary search tree (BST) or not?
Submitted by Radib Kar, on November 25, 2018

Description:

This article describes how to check whether a given tree is BST or not? This problem came in coding round of Microsoft.

Problem Statement:

Given a binary tree check whether it is a binary search tree or not.

Solution

Algorithm:

From the definition of BST, it may seem that for a binary tree to be BST, it’s enough to check for each node if the node on its left is smaller & node on its right is greater. But this is actually the wrong approach since it will give wrong output for many test-cases.

The correct algorithm is to check for each node whether the maximum of the left subtree is lesser than the node & the minimum of the right subtree is greater than the node. This algorithm works perfect but not efficient in terms of time complexity.

Intuition says that the in-order traversal for the BST results in a sorted list of nodes and we use this in our algorithm.

1.  Set prev to INT_MIN.
2.  From main function call checkBST(root, prev)
    //passing prev by reference to update it every time
    checkBST(root, &prev) 
3.  if(root==NULL) 
        return 1; //null tree is BST
4.  do in-order traversal and checking whether all tree node 
    data is sorted or not
    if(!(checkBST(root->left,prev)))  //check left subtree 
        return 0;
    //root->data must be greater than prevsince BST results in 
    //sorted list after in-order traversal.
5.  if(root->data<prev) 
        return 0;
6.  prev=root->data; //update prev value
7.  return checkBST(root->right,prev);//check right subtree
		
		// tree node is defined
class tree{    
	public:
		int data;
		tree *left;
		tree *right;
};
// creating new node
tree* newnode(int data)  
{ 
	tree* node = (tree*)malloc(sizeof(tree)); 
	node->data = data; 
	node->left = NULL; 
	node->right = NULL; 

	return(node); 
} 
//passing reference of prev
int checkBST(tree* root,int &prev){ 
	//null tree is BST
	if(root==NULL) 
		return 1;
	//doing inorder traversal and checking whether 
	//all tree node data is sorted or not
	if(!(checkBST(root->left,prev))) 
		return 0;
	if(root->data<prev)
		return 0;
	prev=root->data; //update prev value

	return checkBST(root->right,prev);
}
Example 1:
		#include <bits/stdc++.h>
		using namespace std;

		int main() 
		{ 
			//**same tree is builted as shown in example**
			int c,prev=INT_MIN;//prev initialized to INT_MIN
			cout<<"Tree is built like the example 1 aforesaid"<<endl;

			tree *root=newnode(8); 
			root->left= newnode(3); 
			root->right= newnode(10); 
			root->right->right=newnode(14);
			root->right->right->left=newnode(13);
			root->left->left=newnode(1); 
			root->left->right=newnode(6);
			root->left->right->left=newnode(4);
			root->left->right->right=newnode(7);

			cout<<"builting the binary tree like example 1......"<<endl; 
			c=checkBST(root,prev);
			if(c)
				cout<<"This binary tree is binary search tree"<<endl;
			else
				cout<<"This is not a binary search tree";

			return 0; 

Example 2:
			#include <bits/stdc++.h>
			using namespace std;

			int main() 
			{ 
				//**same tree is builted as shown in example**
				int c,prev=INT_MIN;//prev initialized to INT_MIN
				cout<<"Tree is built like the example 2 aforesaid"<<endl;

				tree *root=newnode(2); 
				root->left= newnode(7); 
				root->right= newnode(5); 
				root->right->right=newnode(9);
				root->right->right->left=newnode(4);
				root->left->left=newnode(2); 
				root->left->right=newnode(6);
				root->left->right->left=newnode(5);
				root->left->right->right=newnode(11);

				cout<<"builting the binary tree like example 2......"<<endl; 
				c=checkBST(root,prev);
				if(c)
				cout<<"This binary tree is binary search tree"<<endl;
				else
				cout<<"This is not a binary search tree";

				return 0; 
} 
		
} 

	}
	8){1[0]1 Pattern Count
	1[0]1 Pattern Count: Here, we are going to solve an algorithm problem based on pattern searching came in the coding round of Samsung.
Submitted by Radib Kar, on November 26, 2018

Description:

This article provides solution to an algorithm problem based on pattern searching came in the coding round of Samsung.

Problem statement:

Given a binary string, write an algorithm to find the number of patterns of form 1[0]1 where [0] represents any number of zeroes (minimum requirement is one 0) there should not be any other character except 0 in the [0] sequence.

Solution

Algorithm:

Set l = length of string & initialize count to 0.
Find the number of 1's in the string. If all entry is 1 then no such pattern exists for the string input.
Find first '1' for a 1[0]1 pattern
While (String [element]!= '1')
Go to next element.
Check if the next element of the string is '0' or not.
If the next element is '0'
Continue checking next element until the substring of 0 finishes. ([0] part in the pattern)
Once finished check the next element. If it is '1' increase count.
In the next iteration this '1' element is going to be starting element of next 1[0]1 pattern.
Continue steps 3 to 6 until string length finishes for processing.
Return count.

Output:

	First run:
	program to find no of 1[0]1 patterns in string 
	enter string 
	001010100001101
	4

	Second run:
	program to find no of 1[0]1 patterns in string 
	enter string 
	111111111111111111111110 
	0

#include <bits/stdc++.h>
using namespace std;

int my(string s){
	//set variables
	int l=s.length(),count=0;
	for(int i=0;i<l;i++){
		//count no of 1's
		if(s[i]!='0') 
			count++;
	}
	//if no of 1=total length then no 1[0]1 pattern
	if(count==l) 
		return 0;
	
	int i=0,flag=0,start=0,end=1;
	count=0;

	while(i<l){
		//go to first '1' of a pattern
		while(s[i]!='1'){ 
			i++;
		}
		//first 1 is found,check the next
		i=i+1;
		//if next is a 0
		if(s[i]=='0'){ 
			//procedd till elements are 0
			while(s[i]=='0')
				i++;
			//if the element after end of 0 substring is 1
			if(s[i]=='1'){
				//pattern is found & increase count
				count++;
			}
		}
	}
	return count; //return no of pattern
}

int main()
{  

	cout<<"program to find no of 1[0]1 patterns in string"<<endl;
	string s;
	cout<<"enter string"<<endl;  
	cin>>s;
	int k=my(s);
	cout<<k<<endl;    

	return 0;
}
	
	
	}
	9){Capitalize first and last letter of each word in a line
In this article, we are going to learn how to capitalize first and last letter of each word in an input line?
Submitted by Radib Kar, on November 27, 2018

Problem statement:

Given an input line, capitalize first and last letter of each word in the given line. It's provided that the input line is in lowercase.

Solution:

The basic algorithm is to keep track of the spaces and to capitalize the letter before space & after space. Also, the first letter and the last letter of the line should be capitalized.

Few more things that need to be kept in mind such that:

More than one occurrence of space in between two words.
There may be word of single letter like 'a', which need to be capitalized.
There may be word of two letters like 'me', where both the letters need to be capitalized.
Algorithm:

Create a hash table.
Insert index of first letter, i.e., 0 & the index of last letter, i.e., length-1. length be the length of input line.
    For i=0:length-1
    Find index of spaces in the line
    If index before spaces are not in hash table
        Insert into hash table
    If index after spaces are not in hash table
        Insert into hash table
Capitalize the indexes present in the hash table
line [index]-=32;
//ASCII value of lower case letter - ASCII value of corresponding upper case letter=32
Print the converted input line
Inclusion of hash table in the program helps us to avoid inserting duplicate indexes. Otherwise, corner test-cases may fail.


C++ program to capitalize first and last letter of each word in a line
#include <bits/stdc++.h>
using namespace std;

void capitalize(char* arr,int i){
	//ascii value of each lower case letter-ascii value 
	//of each uppercase letter=32
	//i is the length of line
	unordered_set<int> table;
	table.insert(0); //index of first letter of line
	table.insert(i-1);//index of last letter of line
	
	for(int j=1;j<i;j++){
		if(arr[j]==' '){
			// last letter of word is before 
			//space & first letter of word is after space
			//check index already present in hash table or not
			if(table.find(j-1)==table.end())
				table.insert(j-1); //if not insert index
			//check index already present in hash table or not
			if(table.find(j+1)==table.end())			
				table.insert(j+1); //if not insert index
		}
	}
	//capitalize
	for(auto it=table.begin();it!=table.end();it++)
		arr[*it]-=32;
	printf("converted input line is: ");
	//printing 
	for(int j=0;j<i;j++)
		printf("%c",arr[j]);
	printf("\n");
}

int main(){
	//store the input line
	char arr[100];
	char c;
	int i=0;

	printf("input the line.....\n");
	scanf("%c",&c);
	while(c!='\n'){
		arr[i++]=c;
		scanf("%c",&c);
	}
	capitalize(arr,i);
	
	return 0;
}
Output

First run:
input the line.....
hello world
converted input line is: HellO WorlD

Second run:
input the line.....
includehelp is a great paltform for geeks
converted input line is: IncludehelP IS A GreaT PaltforM FoR GeekS 
		
	}
	10){Job sequencing problem
In this article, we are going to see how the job sequencing problem can be solved using greedy strategy?
Submitted by Radib Kar, on December 04, 2018

Problem statement:

Given an array of jobs where every job has a deadline and a profit. Profit can be earned only if the job is finished before the deadline. It is also given that every job takes a single unit of time, so the minimum possible deadline for any job is 1. How to maximize total profit if only one job can be scheduled at a time. Print the sequence of jobID order to maximize total profit.

Input example

JobID	Deadline	Profit
1	4	30
2	2	20
3	2	60
4	2	30
5	1	10
6	4	80
Output example: 4 3 1 6

Problem explanation:

First of all, forget about the greedy algorithm. Let’s just solve with our intuition. Since the problem is to maximize profit intuition says to select jobs in decreasing order according to their profit. That means to select the maximum profit one first, then the 2nd maximum profit one and so on. While selecting jobs we only need to keep track whether it can be finished in deadline.

So let’s start...

It can be seen from the job table that, there are four jobs with the scheduled deadline at most 2. Thus we can only select a maximum of 2 jobs from these 4 jobs since each job take 1 unit time to process. (local observation)

At time 0:

Select maximum profit one with deadline at most 2
Job id: 3, deadline: 2, valid choice, process the job
Profit at time 0 : 60

At time 1:

Select maximum profit one from remaining jobswith deadline at most 2
Job id: 4, deadline: 2, valid choice, process the job
Profit at time 1 : 60+30
That’s why can’t choose job with ID 5 & 2

At time 2:

Select maximum from remaining one with deadline greater than 2
Job id: 6, deadline: 4, valid choice, process the job
Profit at time 2 : 60+30+80

At time 3:

Select job
With job id: 1, deadline : 4, valid choice, process the job
Job sequence : 3 4 6 1
Finally total profit= 60+30+80+30=200


No other choice could have resulted better (you can check it!!!!). Thus the solution is optimized and we have found the maximum solution.

Now, revise what we have done. We have actually sorted the job table according to max profit & then have made the local best choice at each iteration to reduce the problem size & ultimately to reach the goal. Simply speaking, we have used the greedy technique intuitively & greedy algorithm has successfully solved the job sequencing problem.

Now to code simply follow the below steps which are nothing but what we did solving the previous example:

Create a class to define jobs
class job
{
	public:
	int jobid;  //job id
	int deadline; //deadline
	int profit; //profit of the job
};
To take input we have used the concept of array of pointers to the job objects. job *obj[n]; //array of pointer to jobs(jobs namely)
maxProfit function()
Sort all jobs in decreasing order of profit.
To do this we have defined our own compare function & used STL sort.
bool mycompare(job *x,job *y)//boolean function
{
	//sort as per decreasing profite
    return x->profit>y->profit; 
}
sort(obj,obj+n,mycompare);
Find the maximum deadline, let it be max.
Create store[max] to store job sequence
Create slot[max] to mark occupied slots
For i=0:no of jobs
// now pick the job with max deadline from 
// that deadline traverse array backto find an empty slot
for(int j=(obj[i]->deadline)-1;j>=0;j--)
{
	if(slot[j]==false){	// slot is empty
				
	// count the total profit
		profit+=obj[i]->profit;
		store[j]=obj[i]->jobid;
		slot[j]=true;
		break;
	}
	
}
Print the store array to find job sequence and print profit which is maximum profit output

C++ implementation of Job sequencing problem
#include<bits/stdc++.h>
using namespace std;

// define the class for the job
class job
{
	public:
		int jobid;
		int deadline;
		int profit;
};
// our compare function to sort
bool mycompare(job *x,job *y)//boolean function
{
	//sort as per decreasing profit
	return x->profit>y->profit; 
}

int maxProfit(job** obj,int n){
	int max=0,profit=0;;
	//find maximum deadline
	for(int i=0;i<n;i++){
		if(i==0){
			max=obj[i]->deadline;
		}
		else{
			if(obj[i]->deadline>max)
				max=obj[i]->deadline;
		}
	}
	
	sort(obj,obj+n,mycompare);
	// create array of max deadline size
	int store[max]={0};	// empty array initially
	bool slot[max]={false}; //all slots empty initially
	for(int i=0;i<n;i++)
	{	
		// now pick the job with max deadline and from 
		// that deadline traverse array back to find an empty slot
		for(int j=(obj[i]->deadline)-1;j>=0;j--)
		{
			if(slot[j]==false)	// slot is empty
			{	
				// count the total profit
				profit+=obj[i]->profit;
				store[j]=obj[i]->jobid;
				slot[j]=true;
				break;
			}
		}
	}
	// printing the job sequence
	cout<<"jobs sequence is:"<<"\t";
	for(int i=0;i<max;i++)
	{	
		if(slot[i])
			cout<<store[i]<<"  ";
	}
	return profit; //return profit
}

int main()
{	
	int n,size,max,totalprofit=0;
	cout<<"enter the no. of jobs:";
	cin>>n;
	job *obj[n]; //array of pointer to jobs(jobs namely) 
	// user input and finding maximum deadline
	for(int i=0;i<n;i++)
	{	
		obj[i]=(job*)malloc(sizeof(struct job));
		cout<<"enter jobid,deadline and profit of job "<<i+1<<endl;

		cin>>obj[i]->jobid;
		cin>>obj[i]->deadline;
		cin>>obj[i]->profit;
	}

	totalprofit=maxProfit(obj,n); //total profit
	cout<<"\ntotal profit is "<<totalprofit<<"\n";
	
	return 0;	
}
Output

enter the no. of jobs:6
enter jobid,deadline and profit of job 1: 1 4 30
enter jobid,deadline and profit of job 2: 2 2 20
enter jobid,deadline and profit of job 3: 3 2 60  
enter jobid,deadline and profit of job 4: 4 2 30  
enter jobid,deadline and profit of job 5: 5 1 10  
enter jobid,deadline and profit of job 6: 6 4 80  
jobs sequence is:       4  3  1  6
total profit is 200 }
	11){Root to leaf Path Sum
In this article, we are going to see how to check whether there exists a path from root leaf which has exactly the same sum given as input. This problem has been asked in coding round of Samsung, Microsoft, Adobe, Amazon etc
Submitted by Radib Kar, on December 07, 2018

Problem statement

Given a Binary Tree T and a sum S, write a program to check whether there is a root to leaf path in that tree with the input sum S.

Example:

Binary Tree 1//resim olmalı
Fig: Binary Tree

In the above example, the root is 8 & the leaf nodes are 9,1,2,3. There are many root to leaf paths like:
8->5->9
8->5->7->1
8->5->7->12->2
And so on.

The sum for a root to leaf path is the sum of all intermediate nodes, the root & leaf node, i.e., sum of all the nodes on the path. Like for the first path in the above example the root to leaf path sum is 22 (8+5+9)

Our program must be to determine whether the given sum is same as anythe root to leaf path sum. There may be case that more than one root to leaf path has exactly same sum of S, but that’s not of any concern, Our function is a Boolean function to return only yes or not on basis of input.

Let for an example input:

S= 26 & T be the above binary tree in example

Our program should return "YES" as there is a root to leaf path exists which is 8->4->11->3

S=8 & T be the above binary tree in example

Our program should return "NO" as there is no root to leaf path exists which has sum 8


Algorithm

We need to construct a Boolean function hasRootToLeafSum () which will accept a sum value S & a binary tree T

We can implement the above function using recursion. The idea is to subtract current node value & continue to check for both subtrees recursively until we reach the base case. The base case can be of two type:

Root node for the subtrees are NULL & sum is 0 too. This is a valid terminating step. We return TRUE here.
The sum is 0 & we have reached a leaf node. This is of course the valid terminating step. We return TRUE here.
FunctionhasRootToLeafSum (sum value S, root of Binary tree T)

1.  Set path to FALSE. Path represent the Boolean 
    variable which determines whether there is a root to leaf pathor not.
2.  Consider the base cases.
    •   If (root==NULL&&S==0)  //case a
            return true;
    •   Subtract the root node value & check whether we have reached 
        the leaf node with remaining S, 0.
        If (S==0 && root->left==NULL &&root->right==NULL)
            return true;

3.	Recursively check for both right & left subtrees.
        If(root->left) //for left subtree
            path=path||hasRootToLeafSum (root->left, S);

        If (root->right)//for right subtree
            path=path||hasRootToLeafSum (root->right, S); 

4.	Return path ( FALSE or TRUE)

 If the function return FALSE then no path is found else there is a path.

C++ implementation of Root to leaf Path Sum
#include<bits/stdc++.h>
using namespace std;

class tree{ //tree node
	public:
		int data;
		tree *left;
		tree *right;
};

bool hasRootToLeafSum(tree *root, int s){
	bool path=false; //declare boolean variable path
	//base condition checking
	if(root==NULL && s==0)
		return true;

	s-=root->data; //subtract current root value

	//checking whether leaf node reached and remaining sum =0
	if(s==0 && root->left==NULL && root->right==NULL) 
		return true;
	//recursively done for both subtrees
	if(root->left){//for left subtree
		path=path||hasRootToLeafSum(root->left, s);
	}
	if(root->right){//for right subtree
		path=path||hasRootToLeafSum(root->right, s);
	}
	return path;
}


tree* newnode(int data){  //creating new nodes
	tree* node = (tree*)malloc(sizeof(tree)); 
	node->data = data; 
	node->left = NULL; 
	node->right = NULL; 
	return(node); 
} 

int main() { 
	//**same tree is builted as shown in example**
	cout<<"tree in the example is build here"<<endl;
	//building the tree like as in the example
	tree *root=newnode(8); 
	root->left= newnode(5); 
	root->right= newnode(4); 
	root->right->right=newnode(11);
	root->right->right->left=newnode(3);
	root->left->left=newnode(9); 
	root->left->right=newnode(7);
	root->left->right->left=newnode(1);
	root->left->right->right=newnode(12);
	root->left->right->right->left=newnode(2);

	int s;

	cout<<"enter input sum S......"<<endl;
	cin>>s;
	
	if(hasRootToLeafSum(root,s))//if there exists such a path
		cout<<"A root to leaf path with this sum  exists"<<endl;
	else
		cout<<"No such a path exists"<<endl;
	
	return 0; 
} 
Output

First run:
tree in the example is build here
enter input sum S......
26
A root to leaf path with this sum  exists    

Second run:
tree in the example is build here
enter input sum S......
8
No such a path exists
}
	12){}
	13){}
	14){}
	15){}
	16){}
	17){}
	18){}
	19){}
	20){}
	21){}
	22){}
	23){}
	24){}
	25){}
	26){}
	
