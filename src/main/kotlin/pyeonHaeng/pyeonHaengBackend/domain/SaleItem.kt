package pyeonHaeng.pyeonHaengBackend.domain

import jakarta.persistence.*

@Entity
class SaleItem(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sale_item_id")
    var id: Long = 0,

    var name: String,
    var price: Int,
    @Enumerated(value = EnumType.STRING)
    var saleType: SaleType = SaleType.NONE,
    @Enumerated(value = EnumType.STRING)
    var brand: Brand = Brand.NONE,
    var saleDate: Int,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    var item: Item
) : BaseEntity() {
}