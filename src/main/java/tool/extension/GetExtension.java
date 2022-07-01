package tool.extension;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GetExtension {

	private static List<String> extensionList = new ArrayList<String>();

	public static void main(String[] args){
		if(args == null || args.length == 0){
			System.err.println("検索対象のパスを指定してください。");
			return ;
		}

		File home = new File(args[0]);
		setExtensionList(home);

		for(String extension : extensionList){
			System.out.println(extension);
		}
	}

	private static void setExtensionList(File path){
		if(path.isFile()){
			String suffix = getSuffix(path.getName());
			if(suffix != null && !extensionList.contains(suffix)){
				extensionList.add(suffix);
			}
		} else {
			File fileList[] = path.listFiles();
			for(File file : fileList){
				setExtensionList(file);
			}
		}
	}

	/**
	 * ファイル名から拡張子を返します。
	 * @param fileName ファイル名
	 * @return ファイルの拡張子
	 * @author https://chat-messenger.com/blog-entry-38.html
	 */
	private static String getSuffix(String fileName){
	    if (fileName == null){
	        return null;
	    }
	    int point = fileName.lastIndexOf(".");
	    if (point != -1) {
	        return fileName.substring(point + 1);
	    }
	    return null;
	}

}
