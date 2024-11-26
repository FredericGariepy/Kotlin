// https://play.kotlinlang.org/#eyJ2ZXJzaW9uIjoiMi4wLjIxIiwicGxhdGZvcm0iOiJqYXZhIiwiYXJncyI6IiIsIm5vbmVNYXJrZXJzIjp0cnVlLCJ0aGVtZSI6ImlkZWEiLCJjb2RlIjoiLy8gS290bGluIFN0dWR5IG5vdGVzIGZvciAxMS8yNi8yNCAtRnJlZFxuXG5mdW4gbWFpbigpIHtcblxuICAgIC8vIExhbWJkYSBmdW5jdGlvblxuICAgIHZhbCBsYW1iZGFfYWRkOiAoSW50LCBJbnQpIC0+IEludCA9IHsgYSwgYiAtPiBhICsgYiB9XG4gICAgXG4gICAgLy8gUmVndWxhciBmdW5jdGlvbiBmb3IgYWRkaXRpb25cbiAgICBmdW4gZnVuY3Rpb25fYWRkKGE6IEludCwgYjogSW50KTogSW50IHtcbiAgICAgICAgcmV0dXJuIGEgKyBiXG4gICAgfVxuICAgIFxuICAgIC8vIEV4YW1wbGUgbGlzdCBvZiBudW1iZXJzXG4gICAgdmFsIG51bWJlcnMgPSBsaXN0T2YoMSwgMiwgMywgNClcbiAgICBwcmludGxuKFwibnVtYmVyczogJG51bWJlcnNcIilcbiAgICBcbiAgICAvLyBHZXQgaW5kZXggMCB0byAxIChmaXJzdCB0d28gZWxlbWVudHMpXG4gICAgdmFsIHJhbmdlMHRvMSA9IG51bWJlcnMuc3ViTGlzdCgwLCAyKSAvLyB1cC10byBub24taW5jbHVzaXZlXG4gICAgcHJpbnRsbihyYW5nZTB0bzEpICAvLyBPdXRwdXRzOiBbMSwgMl1cbiAgICBcbiAgICAvLyBHZXQgaW5kZXggZWxlbWVudFxuICAgIHZhbCBpbmRleDAgPSBudW1iZXJzWzBdXG4gICAgcHJpbnRsbihpbmRleDApICAvLyBPdXRwdXRzOiAxXG4gICAgXG4gICAgdmFsIHNwZWNpZmljSW5kZXggPSBsaXN0T2YobnVtYmVyc1swXSwgbnVtYmVyc1szXSlcbiAgICBwcmludGxuKHNwZWNpZmljSW5kZXgpIC8vIE91dHB1dHM6IFsxLDRdXG4gICAgXG4gICAgLy8gR2V0IHRoZSBmaXJzdCBlbGVtZW50IFxuICAgIHZhbCBmaXJzdEVsZW1lbnQgPSBudW1iZXJzLmZpcnN0KCkgLy8gdGhyb3dzIE5vU3VjaEVsZW1lbnRFeGNlcHRpb24gaWYgdGhlIGxpc3QgaXMgZW1wdHlcbiAgICB2YWwgZmlyc3RFbGVtZW50T3JOdWxsID0gbnVtYmVycy5maXJzdE9yTnVsbCgpIC8vIHJldHVybnMgbnVsbCBpZiB0aGUgbGlzdCBpcyBlbXB0eVxuICAgIFxuICAgIC8vIEdldCB0aGUgbGFzdCBlbGVtZW50XG4gICAgdmFsIGxhc3RFbGVtZW50ID0gbnVtYmVycy5sYXN0KCkgLy8gdGhyb3dzIE5vU3VjaEVsZW1lbnRFeGNlcHRpb24gaWYgdGhlIGxpc3QgaXMgZW1wdHlcbiAgICB2YWwgbGFzdEVsZW1lbnRPck51bGwgPSBudW1iZXJzLmxhc3RPck51bGwoKSAvLyByZXR1cm5zIG51bGwgaWYgdGhlIGxpc3QgaXMgZW1wdHlcbiAgICBcbiAgICAvLyBIYW5kbGUgbnVsbCB2YWx1ZXMgdXNpbmcgdGhlIHRlcm5hcnkgKGFsc28gRWx2aXMpIG9wZXJhdG9yIChwcm92aWRpbmcgZGVmYXVsdCB2YWx1ZSAwKSAvL1xuICAgIHByaW50bG4obGFtYmRhX2FkZChmaXJzdEVsZW1lbnRPck51bGwgPzogMCwgbGFzdEVsZW1lbnRPck51bGwgPzogMCkpICAvLyBPdXRwdXRzOiA1IG9yIDAgaWYgbnVsbFxuICAgIHByaW50bG4obGFtYmRhX2FkZChmaXJzdEVsZW1lbnQsIGxhc3RFbGVtZW50T3JOdWxsID86IDApKSAvLyBPdXRwdXRzOiA1IG9yIHRocm93cyBOb1N1Y2hFbGVtZW50RXhjZXB0aW9uIGlmIHRoZSBsaXN0IGlzIGVtcHR5XG4gICAgXG4gICAgdmFsIGxhc3RJbmRleCA9IG51bWJlcnMuc2l6ZSAtIDFcbiAgICBwcmludGxuKGxhbWJkYV9hZGQoaW5kZXgwLCBudW1iZXJzW2xhc3RJbmRleF0pKSAvLyBPdXRwdXRzOiA1IG9yIHdpbGwgcnVuIGludG8gZXJyb3JcbiAgICBcbiAgICBcbiAgICAvLyAubWFwIC0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tXG4gICAgdmFsIGRvdWJsZWRNYXAgPSBudW1iZXJzLm1hcCB7IGl0ICogMiB9IC8vIFwiaXRcIiBpcyBhIHNob3J0aGFuZCBmb3IgZWFjaCBlbGVtZW50IGluIHRoZSBsaXN0XG4gICAgcHJpbnRsbihkb3VibGVkTWFwKSAgLy8gT3V0cHV0czogWzIsIDQsIDYsIDhdXG5cbiAgICAvLyBFcXVpdmFsZW50IGNvZGUgdXNpbmcgYSBsb29wIChtYW51YWwgYXBwcm9hY2gpXG4gICAgdmFsIGRvdWJsZWRMb29wID0gbXV0YWJsZUxpc3RPZjxJbnQ+KClcbiAgICBmb3IgKG4gaW4gbnVtYmVycykge1xuICAgICAgICBkb3VibGVkTG9vcC5hZGQobiAqIDIpXG4gICAgfVxuICAgIHByaW50bG4oZG91YmxlZExvb3ApICAvLyBPdXRwdXRzOiBbMiwgNCwgNiwgOF1cbiAgICBcbiAgICBcbiAgICAvLyAuZmlsdGVyIC0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tXG4gICAgdmFsIGV2ZW5OdW1iZXJzRmlsdGVyID0gbnVtYmVycy5maWx0ZXIgeyBpdCAlIDIgPT0gMCB9IC8vIFwiaXRcIiByZWZlcnMgdG8gZWFjaCBlbGVtZW50XG4gICAgcHJpbnRsbihldmVuTnVtYmVyc0ZpbHRlcikgIC8vIE91dHB1dHM6IFsyLCA0XVxuICAgIFxuICAgIC8vIE1hbnVhbCBhcHByb2FjaCBmb3IgZmlsdGVyaW5nIGV2ZW4gbnVtYmVyc1xuICAgIHZhbCBldmVuTnVtYmVyc0xvb3AgPSBtdXRhYmxlTGlzdE9mPEludD4oKVxuICAgIGZvciAobiBpbiBudW1iZXJzKSB7XG4gICAgICAgIGlmIChuICUgMiA9PSAwKSB7XG4gICAgICAgICAgICBldmVuTnVtYmVyc0xvb3AuYWRkKG4pXG4gICAgICAgIH1cbiAgICB9XG4gICAgcHJpbnRsbihldmVuTnVtYmVyc0xvb3ApIC8vIE91dHB1dHM6IFsyLCA0XVxuICAgIFxuICAgIFxuICAgIC8vIC5yZWR1Y2UgdnMgLmZvbGQgLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tXG4gICAgXG4gICAgLy8gLnJlZHVjZSB8IHJlZHVjZXMgdGhlIGVsZW1lbnRzIG9mIHRoZSBjb2xsZWN0aW9uIHRvIGEgc2luZ2xlIHZhbHVlIGJ5IHJlcGVhdGVkbHkgYXBwbHlpbmcgdGhlIHByb3ZpZGVkIG9wZXJhdGlvbi5cbiAgICB2YWwgc3VtID0gbnVtYmVycy5yZWR1Y2UgeyBhY2MsIG51bWJlciAtPiBhY2MgKyBudW1iZXIgfSAvLyBhY2MgaXMgdGhlIGFjY3VtdWxhdG9yIChydW5uaW5nIHN1bSlcbiAgICBwcmludGxuKHN1bSkgIC8vIE91dHB1dHM6IDEwXG4gICAgXG4gICAgLy8gLmZvbGQgIHwgLmZvbGQgaXMgc2ltaWxhciB0byAucmVkdWNlIGJ1dCBhbGxvd3MgeW91IHRvIHNwZWNpZnkgYW4gaW5pdGlhbCBhY2N1bXVsYXRvciB2YWx1ZS5cbiAgICB2YWwgc3VtV2l0aEluaXRpYWwgPSBudW1iZXJzLmZvbGQoMTApIHsgYWNjLCBudW1iZXIgLT4gYWNjICsgbnVtYmVyIH1cbiAgICBwcmludGxuKHN1bVdpdGhJbml0aWFsKSAvLyBPdXRwdXQ6IDIwXG4gICAgXG4gICAgXG4gICAgLy8gLmFueSBhbmQgLmFsbCAtLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLVxuICAgIHByaW50bG4obnVtYmVycy5hbnkgeyBpdCAlIDIgPT0gMCB9KSAgLy8gT3V0cHV0czogdHJ1ZSAoYXQgbGVhc3Qgb25lIGV2ZW4gbnVtYmVyKVxuXHRwcmludGxuKG51bWJlcnMuYWxsIHsgaXQgJSAyID09IDAgfSkgLy8gT3V0cHV0czogZmFsc2UgKG5vdCBhbGwgbnVtYmVycyBhcmUgZXZlbilcbiAgICBcbiAgICAvLyAuZmluZCBhbmQgLmZpbmRMYXN0IC0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tXG4gICAgcHJpbnRsbihudW1iZXJzLmZpbmQgeyBpdCAlIDIgPT0gMCB9KSAgLy8gT3V0cHV0czogMiAoZmlyc3QgZXZlbiBudW1iZXIpXG4gICAgcHJpbnRsbihudW1iZXJzLmZpbmRMYXN0IHsgaXQgJSAyID09IDAgfSkgIC8vIE91dHB1dHM6IDQgKGxhc3QgZXZlbiBudW1iZXIpXG4gICAgIFxuICAgIC8vIC5ncm91cEJ5IC0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tXG4gICAgdmFsIGdyb3VwZWRCeUV2ZW5PZGQgPSBudW1iZXJzLmdyb3VwQnkgeyBpdCAlIDIgPT0gMCB9IC8vQm9vbGVhbiBkaXN0cmlidXRpb25cbiAgICBwcmludGxuKGdyb3VwZWRCeUV2ZW5PZGQpICAvLyBPdXRwdXQ6IHtmYWxzZT1bMSwgMywgNV0sIHRydWU9WzIsIDQsIDZdfVxuICAgIFxuICAgIHZhbCBncm91cGVkQnlDdXN0b20gPSBudW1iZXJzLmdyb3VwQnkge1xuICAgICAgICB3aGVuIHtcbiAgICAgICAgICAgIGl0IDwgZmlyc3RFbGVtZW50ICsgMSAtPiBcIkdyb3VwIEFcIlxuICAgICAgICAgICAgaXQgaW4gMS4uMyAtPiBcIkdyb3VwIEJcIlxuICAgICAgICAgICAgZWxzZSAtPiBcIkdyb3VwIENcIlxuICAgICAgICB9XG4gICAgfVxuICAgIHByaW50bG4oZ3JvdXBlZEJ5Q3VzdG9tKSAvLyBPdXRwdXQ6IHtHcm91cCBBPVsxXSwgR3JvdXAgQj1bMiwgM10sIEdyb3VwIEM9WzRdfVxuICAgIFxuICAgIFxuICAgIC8vIC5wYXJ0aXRpb25cbiAgICB2YWwgKGV2ZW5zLCBvZGRzKSA9IG51bWJlcnMucGFydGl0aW9uIHsgaXQgJSAyID09IDAgfVxuICAgIHByaW50bG4oZXZlbnMpICAvLyBPdXRwdXQ6IFsyLCA0XVxuICAgIHByaW50bG4ob2RkcykgLy8gT3V0cHV0OiBbMSwgM11cbiAgICBcbiAgICAvLyAuemlwXG4gICAgdmFsIHppcHBlZCA9IG9kZHMuemlwKGV2ZW5zKSBcbiAgICBwcmludGxuKHppcHBlZCkgLy8gT3V0cHV0OiBbKDEsIDIpLCAoMywgNCldXG4gICAgXG4gICAgdmFsIHppcHBlZFNlbGYgPSBudW1iZXJzLnppcChudW1iZXJzKVxuICAgIHByaW50bG4oemlwcGVkU2VsZikgIC8vIE91dHB1dDogWygxLCAxKSwgKDIsIDIpLCAoMywgMyksICg0LCA0KV1cbiAgICBcbiAgICAvLyAuZHJvcCBhbmQgLnRha2VcbiAgICBcbiAgICAvLyAudGFrZSAtIHRha2UobikgcmV0dXJucyB0aGUgZmlyc3QgbiBlbGVtZW50cy5cbiAgICBwcmludGxuKG51bWJlcnMudGFrZSgyKSkgIC8vIE91dHB1dHM6IFsxLCAyXVxuICAgIFxuICAgIC8vLmRyb3AobikgcmV0dXJucyBhbGwgZWxlbWVudHMgZXhjZXB0IHRoZSBmaXJzdCBuLlxuICAgIHByaW50bG4obnVtYmVycy5kcm9wKDIpKSAvLyBPdXRwdXRzOiBbMywgNF1cbiAgICBcbiAgICBcbiAgICBcbn0ifQ==
fun main() {

    // Lambda function
    val lambda_add: (Int, Int) -> Int = { a, b -> a + b }
    
    // Regular function for addition
    fun function_add(a: Int, b: Int): Int {
        return a + b
    }
    
    // Example list of numbers
    val numbers = listOf(1, 2, 3, 4)
    println("numbers: $numbers")
    
    // Get index 0 to 1 (first two elements)
    val range0to1 = numbers.subList(0, 2) // up-to non-inclusive
    println(range0to1)  // Outputs: [1, 2]
    
    // Get index element
    val index0 = numbers[0]
    println(index0)  // Outputs: 1
    
    val specificIndex = listOf(numbers[0], numbers[3])
    println(specificIndex) // Outputs: [1,4]
    
    // Get the first element 
    val firstElement = numbers.first() // throws NoSuchElementException if the list is empty
    val firstElementOrNull = numbers.firstOrNull() // returns null if the list is empty
    
    // Get the last element
    val lastElement = numbers.last() // throws NoSuchElementException if the list is empty
    val lastElementOrNull = numbers.lastOrNull() // returns null if the list is empty
    
    // Handle null values using the ternary (also Elvis) operator (providing default value 0) //
    println(lambda_add(firstElementOrNull ?: 0, lastElementOrNull ?: 0))  // Outputs: 5 or 0 if null
    println(lambda_add(firstElement, lastElementOrNull ?: 0)) // Outputs: 5 or throws NoSuchElementException if the list is empty
    
    val lastIndex = numbers.size - 1
    println(lambda_add(index0, numbers[lastIndex])) // Outputs: 5 or will run into error
    
    
    // .map --------------------------------------------
    val doubledMap = numbers.map { it * 2 } // "it" is a shorthand for each element in the list
    println(doubledMap)  // Outputs: [2, 4, 6, 8]

    // Equivalent code using a loop (manual approach)
    val doubledLoop = mutableListOf<Int>()
    for (n in numbers) {
        doubledLoop.add(n * 2)
    }
    println(doubledLoop)  // Outputs: [2, 4, 6, 8]
    
    
    // .filter --------------------------------------------
    val evenNumbersFilter = numbers.filter { it % 2 == 0 } // "it" refers to each element
    println(evenNumbersFilter)  // Outputs: [2, 4]
    
    // Manual approach for filtering even numbers
    val evenNumbersLoop = mutableListOf<Int>()
    for (n in numbers) {
        if (n % 2 == 0) {
            evenNumbersLoop.add(n)
        }
    }
    println(evenNumbersLoop) // Outputs: [2, 4]
    
    
    // .reduce vs .fold ---------------------------------------
    
    // .reduce | reduces the elements of the collection to a single value by repeatedly applying the provided operation.
    val sum = numbers.reduce { acc, number -> acc + number } // acc is the accumulator (running sum)
    println(sum)  // Outputs: 10
    
    // .fold  | .fold is similar to .reduce but allows you to specify an initial accumulator value.
    val sumWithInitial = numbers.fold(10) { acc, number -> acc + number }
    println(sumWithInitial) // Output: 20
    
    
    // .any and .all --------------------------------------------
    println(numbers.any { it % 2 == 0 })  // Outputs: true (at least one even number)
	println(numbers.all { it % 2 == 0 }) // Outputs: false (not all numbers are even)
    
    // .find and .findLast --------------------------------------------
    println(numbers.find { it % 2 == 0 })  // Outputs: 2 (first even number)
    println(numbers.findLast { it % 2 == 0 })  // Outputs: 4 (last even number)
     
    // .groupBy --------------------------------------------
    val groupedByEvenOdd = numbers.groupBy { it % 2 == 0 } //Boolean distribution
    println(groupedByEvenOdd)  // Output: {false=[1, 3, 5], true=[2, 4, 6]}
    
    val groupedByCustom = numbers.groupBy {
        when {
            it < firstElement + 1 -> "Group A"
            it in 1..3 -> "Group B"
            else -> "Group C"
        }
    }
    println(groupedByCustom) // Output: {Group A=[1], Group B=[2, 3], Group C=[4]}
    
    
    // .partition
    val (evens, odds) = numbers.partition { it % 2 == 0 }
    println(evens)  // Output: [2, 4]
    println(odds) // Output: [1, 3]
    
    // .zip
    val zipped = odds.zip(evens) 
    println(zipped) // Output: [(1, 2), (3, 4)]
    
    val zippedSelf = numbers.zip(numbers)
    println(zippedSelf)  // Output: [(1, 1), (2, 2), (3, 3), (4, 4)]
    
    // .drop and .take
    
    // .take - take(n) returns the first n elements.
    println(numbers.take(2))  // Outputs: [1, 2]
    
    //.drop(n) returns all elements except the first n.
    println(numbers.drop(2)) // Outputs: [3, 4]   
}
