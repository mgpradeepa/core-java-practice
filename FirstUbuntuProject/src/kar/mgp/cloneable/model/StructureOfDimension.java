package kar.mgp.cloneable.model;

import java.util.LinkedList;
import java.util.List;

public class StructureOfDimension {

	public static List<Dimen> getDimensionObject() {

/*		Dimen rootDimen = new Dimen();

		// dimension level 1 ==>
		Dimen dimen = new Dimen();
		dimen.setAttrs(null);
		dimen.setName("level1");
		List<Dimen> dimenList1 = new LinkedList<Dimen>();
		dimenList1.add(dimen);

		// level 2

		Dimen dimen2 = new Dimen();
		dimen2.setAttrs(null);
		dimen2.setName("level2");
		dimen2.setDimens(null);

		rootDimen.setAttrs(null);
		rootDimen.setName("rootdimens");
		rootDimen.setDimens(dimenList1);
*/
		
		
		
		
/*//		level 4
		
		List<Dimen> level4AndLeaf = new LinkedList<Dimen>();
		List<Prod> prodList = new LinkedList<Prod>();
		Prod prd1= new Prod("pcodel4", "pidl4", "webidl4");
		Prod prd2= new Prod("pcodel42", "pidl42", "webidl42");
		prodList.add(prd1);
		prodList.add(prd2);
		Dimen dime4 = new Dimen("level4", null, prodList, null);
		level4AndLeaf.add(dime4);
		
		
		//level 3
		List<Dimen> level3List = new LinkedList<Dimen>();	
		Dimen dimen3 = new Dimen("level3", null, null, level4AndLeaf);
		level3List.add(dimen3);

		*/
		//level 2
		
		List<Dimen>  level2List = new LinkedList<Dimen>();
		Dimen dimen22 = new Dimen("level2", null, null, null);
		level2List.add(dimen22);
		
		//level 1
		
		List<Dimen> rootDimenList = new LinkedList<Dimen>();
		Dimen rootDimens = new Dimen("rootdimen", null, null, level2List);
		rootDimenList.add(rootDimens);
		
		
		
		return rootDimenList;

	}

}
