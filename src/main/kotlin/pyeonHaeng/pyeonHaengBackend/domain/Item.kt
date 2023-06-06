package pyeonHaeng.pyeonHaengBackend.domain

import jakarta.persistence.*

@Entity
class Item(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    var id: Long = 0,

    var name: String,
    var image: String,
    var minPrice: Int,

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sub_category_id")
    var subCategory: SubCategory,

    @OneToMany(mappedBy = "item")
    var saleItemList: List<SaleItem> = mutableListOf()

) : BaseEntity() {
}