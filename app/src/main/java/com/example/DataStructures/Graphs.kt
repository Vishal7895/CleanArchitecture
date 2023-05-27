package com.example.DataStructures

data class Node(val name:String)

data class Edge(val destination:Node,val weight:Int)

class  Graphs{
    private val adjancyMap:MutableMap<Node,MutableList<Edge>> = mutableMapOf()
    fun addNode(node: Node){
        adjancyMap[node]= mutableListOf()

    }
    fun addEdge(source:Node,destination: Node,weight: Int){
        val edge = Edge(destination,weight)
        adjancyMap[source]?.add(edge)
    }
    fun shortestPath(startNode:Node,endNode:Node):List<Node>{
        val distance:MutableMap<Node,Int> = mutableMapOf()
        val previous :MutableMap<Node,Node?> = mutableMapOf()
        val visited:MutableSet<Node> = mutableSetOf()

        for (node in adjancyMap.keys){
            distance[node]=Int.MAX_VALUE
            previous[node]=null
        }
        distance[startNode]=0
        while (visited.size<adjancyMap.size){
            val currentNode = getNodeWithMinimumDistance(distance,visited)
            visited.add(currentNode)
            if (currentNode== endNode)
                break
            val edges=adjancyMap[currentNode]
            if (edges!=null){
                for (edge in edges){
                    val newDistance = distance[currentNode]!!+edge.weight
                    if (newDistance<distance[edge.destination]!!){
                        distance[edge.destination]=newDistance
                        previous[edge.destination]=currentNode
                    }

                }
            }
        }
        return buildshortestPath(endNode,previous)
    }

    private fun getNodeWithMinimumDistance(distance: MutableMap<Node, Int>, visited: MutableSet<Node>): Node {
var minNode:Node?=null
        var minDistance=Int.MAX_VALUE
        for (enteries in distance.entries){
            val node =enteries.key
            val distance = enteries.value
            if (distance<minDistance && !visited.contains(node)){
                minDistance=distance
                minNode=node


            }
        }
        return minNode!!
    }

    private fun buildshortestPath(endNode: Node,previous:MutableMap<Node,Node?>):List<Node>{
        val path = mutableListOf<Node>()
        var currentNode :Node?=endNode
        while (currentNode!=null){
            path.add(currentNode)
            currentNode=previous[currentNode]

        }
        return path.reversed()
    }


}