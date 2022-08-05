#!/usr/bin/env groovy
import java.nio.file.Path
import java.nio.file.Paths

import net.sourceforge.plantuml.FileFormat
import net.sourceforge.plantuml.FileFormatOption
import net.sourceforge.plantuml.SourceFileReader

println '*' * 80
println '*' * 80


Path scriptPath = Paths.get(this.getClass().protectionDomain.codeSource.location.toURI())
println "script file: ${scriptPath}"

Path docsPath = scriptPath.parent.parent
println "docs path: ${docsPath}"

Path rootPath = scriptPath
while(rootPath.toString().contains('jmacro-docs')) {
	rootPath = rootPath.parent
}
println "root path: ${rootPath}"

Set<String> modules = []

println('Reading modules names...')
rootPath.toFile().traverse(nameFilter: ~/.*module-info\.java$/) { file ->
	println "File: ${file}"
	String module = file.withReader { reader -> reader.readLine().split(' ')[1] }
	modules << module
	println module
}

println('Building modules tree...')
Map modulesTree = [:]
modules.each { String module ->
	Map tree = modulesTree
	module.split('\\.').each { String part ->
		if (!tree.containsKey(part)) {
			tree[part] = [:]
		}
		tree = tree[part]
	}
}

String tree2puml(Map<String, Map> tree, String name = null, int level = 0, String tab = '    ') {
	String tabs = tab * level
	if (tree == null || tree.size() == 0) {
		return "${tabs}[${name}]"
	}
	if (tree.size() == 1) {
		String nextKey = tree.keySet().iterator().next()
		String newKey = name == null ? nextKey : "${name}.${nextKey}"
		return tree2puml(tree[nextKey], newKey, level)
	} else {
		String children = tree.collect{ String k, Map<String, Map> v ->
			tree2puml(v, k, level + 1, tab)
		}.join("\n")
		return name == null ? children : "${tabs}package ${name}{\n${children}\n${tabs}}"
	}
}

Path diagramsPath = docsPath.resolve("diagrams")

println('Writing modules diagram...')
String puml = "@startuml\n!theme crt-green\n${tree2puml(modulesTree)}\n@enduml\n"
Path targetPuml = diagramsPath.resolve("modules.puml")
println "target puml: ${targetPuml}"
targetPuml.toFile().withWriter { it.write(puml) }

println('Generating diagram image file...')
new SourceFileReader(targetPuml.toFile(), diagramsPath.resolve("svg").toFile(), new FileFormatOption(FileFormat.SVG)).getGeneratedImages().each { println it } 
println("...done.")


println '*' * 80
println '*' * 80
