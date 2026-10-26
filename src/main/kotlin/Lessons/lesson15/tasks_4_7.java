package Lessons.lesson15;



    class InsertFirstMaterial : Materials() {

        fun insert(item: String) {
            val materials = extractMaterials()
            addMaterial(item)
            materials.forEach {
                addMaterial(it)
            }
        }
    }

    class InsertOneByOneMaterials : Materials() {

        fun insert(items: List<String>) {
            val materials = extractMaterials()
            val maxIndex = max(items.lastIndex, materials.lastIndex)
            for (i in 0..maxIndex) {
                if (i < items.size) {
                    addMaterial(items[i])
                }
                if (i < materials.size) {
                    addMaterial(materials[i])
                }
            }
        }
    }

    class InsertSortedMaterials : Materials() {

        fun insert(item: String) {
            val materials = (extractMaterials() + item).sorted()
            materials.forEach {
                addMaterial(it)
            }
        }
    }

    class InsertMapMaterials : Materials() {

        fun insert(items: Map<String, String>) {
            val materials = items.keys.reversed() + extractMaterials() + items.values
            materials.forEach {
                addMaterial(it)
            }
        }
    }

