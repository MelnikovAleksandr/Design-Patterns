package adapter

/**
 * Adapter
 */

interface Adapter<T> {
    fun getItem(position: Int): T
    fun getItemCount(): Int
}

class RecyclerView<T> {

    private var adapter: Adapter<T>? = null

    fun setAdapter(adapter: Adapter<T>) {
        this.adapter = adapter
    }

    fun draw(): List<T> {
        val items = mutableListOf<T>()
        val myAdapter = adapter
        if (myAdapter != null) {
            val count = myAdapter.getItemCount()
            for (i in 0 until count) {
                items.add(myAdapter.getItem(i))
            }
        }
        return items
    }
}