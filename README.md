Made by: Ian Campbell

This is an implementation of a hashing table.  

This hash table deals with collisions by chaining. I’ve chosen to use my own coded linked list as the standard container. 

This hash table uses the multiplication method to generate hash keys. 

How to use:
Here is a short list of methods available upon running this program. 
type 1 to: load: inserts data(String) from a file by entering a file name. a prompt will show. (merges any preexisting data)

type 2 to: insert: inserts an entry from the keyboard.

Type 3 to: delete: will prompt for a key, then delete that entry from the hash table, given it exists. 

Type 4 to: search: searches by key value, will be prompted for a key value upon execution. Program then displays entry, or tells user that entry does not exist. 

Type 5 to: clear: clears entire hash table. No entries will survive…

Type 6 to: save the entire hash table to a disk (prompts for a file name) 

Type 7 to: quit: quits.

Example: 

(1)load (2)insert (3)delete (4)search (5)clear (6)save (7)quit -- Your choice? 4
search for record - key? 123456789

Search not found: 123456789

(1)load (2)insert (3)delete (4)search (5)clear (6)save (7)quit -- Your choice? 2
input new record:
123456789 this is a test

(1)load (2)insert (3)delete (4)search (5)clear (6)save (7)quit -- Your choice? 4
search for record - key? 123456789

Found: 123456789 this is a test

(1)load (2)insert (3)delete (4)search (5)clear (6)save (7)quit -- Your choice? 3
delete record - key? 123456789

Delete: 123456789 this is a test

(1)load (2)insert (3)delete (4)search (5)clear (6)save (7)quit -- Your choice? 4
search for record - key? 123456789

Search not found: 123456789

(1)load (2)insert (3)delete (4)search (5)clear (6)save (7)quit -- Your choice? 3
delete record - key? 123456789

Delete not found: 123456789

(1)load (2)insert (3)delete (4)search (5)clear (6)save (7)quit -- Your choice? 1
read hash table - filename? foo

(1)load (2)insert (3)delete (4)search (5)clear (6)save (7)quit -- Your choice? 6
write hash table - filename? foo2

(1)load (2)insert (3)delete (4)search (5)clear (6)save (7)quit -- Your choice? 5
clearing hash table.

(1)load (2)insert (3)delete (4)search (5)clear (6)save (7)quit -- Your choice? 7