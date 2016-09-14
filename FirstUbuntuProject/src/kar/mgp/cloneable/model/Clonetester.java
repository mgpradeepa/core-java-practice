package kar.mgp.cloneable.model;

import java.util.LinkedList;
import java.util.List;

import kar.mgp.model.Catalog;

public class Clonetester {

	/**
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		/*
		 * // TODO Auto - generated method stub
		 * 
		 * Dimen masterDimen = null ;
		 * 
		 * // For dime 1 Prod prod = new Prod ( ) ; prod . setProductcode (
		 * "pr123" ) ; prod . setProductId ( "3225" ) ; prod . setWebId ( "225"
		 * ) ;
		 * 
		 * List< Prod > prods = new LinkedList < Prod > ( ) ; prods . add ( prod
		 * ) ;
		 * 
		 * Attr attr = new Attr ( ) ; attr . setKey ( "atrkey1" ) ; attr .
		 * setValue ( "attrval1" ) ; List < Attr > attrs = new LinkedList < Attr
		 * > ( ) ; attrs . add ( attr ) ;
		 * 
		 * List< Dimen > dimensions = new LinkedList < Dimen > ( ) ; Dimen dimen
		 * = new Dimen ( "dimName" , attrs , prods , dimensions ) ;
		 * 
		 * dimensions . add ( dimen ) ;
		 * 
		 * // for dim 2 Prod prod2 = new Prod ( ) ; prod2 . setProductcode (
		 * "pr123-2" ) ; prod2 . setProductId ( "3225-2" ) ; prod2 . setWebId (
		 * "225-2" ) ;
		 * 
		 * List< Prod > prods2 = new LinkedList < Prod > ( ) ; prods2 . add (
		 * prod2 ) ;
		 * 
		 * Attr attr2 = new Attr ( ) ; attr2 . setKey ( "atrkey1-2" ) ; attr2 .
		 * setValue ( "attrval1-2" ) ; List < Attr > attrs2 = new LinkedList <
		 * Attr > ( ) ; attrs2 . add ( attr2 ) ;
		 * 
		 * List< Dimen > dimensions2 = new LinkedList < Dimen > ( ) ; Dimen
		 * dimen2 = new Dimen ( "dimName2" , attrs2 , prods2 , dimensions2 ) ;
		 * 
		 * masterDimen = new Dimen ( ) ; dimensions2 . add ( dimen2 ) ;
		 * masterDimen . setDimens ( dimensions2 ) ;
		 * 
		 * 
		 * for ( Dimen dime : dimensions ) { while ( dime . getDimens ( ) !=
		 * null ) { createCategories ( dime ) ; } / / createDimension } Categ
		 * categ = ( Categ ) dimen . clone ( ) ; System . out . println (
		 * "Categ--> " + categ ) ;
		 */

		List<Dimen> dimensionList = StructureOfDimension.getDimensionObject();
		System.out.println("List size --> " + dimensionList.size());
		Categ categ = null;
		Categ  temp = null;
		
//		for (Dimen dimen : dimensionList) {
//			categ = new Categ();
//			System.out.println("Dimension--> \n" + dimen);
//			List<Categ> categList = new LinkedList<Categ>();
//				
//				if (dimen.getDimens() == null) {
//					
//					createCategories(dimen, categ, categList);
//			}
//			System.out.println("temp --> " + temp );
//			}

		boolean idPresentInCache = false;
		List<Categ> categs = new LinkedList<Categ>();
		Catalog catalog = new Catalog();
		//add categories list to Catalog
		List<Categ> masterListForThisNode= new LinkedList<Categ>();
		List<Categ> cateList  = null;
		Categ subCategs = new Categ();
		boolean catIdPresentInDimensionTreeObject=true;
		for(Dimen dimen : dimensionList) {
			if(catIdPresentInDimensionTreeObject ) {
				if(dimen.hasDim) {
					cateList = new LinkedList<Categ>();
					Categ ca = new Categ();
					createCategories(dimen, subCategs, cateList);
					ca.setCategs(cateList);
					masterListForThisNode.add(ca);
				}
				
			
			
			}
		}
		catalog.setCatagories(masterListForThisNode);
	}

	private static List<Categ> createCategories(Dimen dimen, Categ categ, List<Categ> categList) {
		categList = new LinkedList<Categ>();
		categ = new Categ();
		categ.setName(dimen.getName());
		categ.setAttrs(dimen.getAttrs());
		categ.setProds(dimen.getProds());
		categList.add(categ);
		System.out.println("categ list  == > " + categList);
		return categList;

	}
	
	

	private Categ getCacheLeafCateg(Dimen dimen, Categ categ){
		return new Categ();
	}
}

