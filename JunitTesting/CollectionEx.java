package com.test;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx {
private List<String> names=new ArrayList<String>();

public void addName(String name)
{
	names.add(name);
}

public void removeName(String name)
{
names.remove(name);	
}

public void removeAllName()
{
names.clear();
}

public int length()
{
	return names.size();	
}

public String getName(int index)
{
return names.get(index);	
}

public void updateName(int index,String name)
{
names.set(index, name);	
}
}
