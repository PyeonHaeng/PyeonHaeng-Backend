package pyeonHaeng.pyeonHaengBackend.domain

import jakarta.persistence.*

@Entity
class SubCategory(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sub_category_id")
    var id: Long = 0,

    var name: String,
    var image: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    var category: Category
) : BaseEntity() {
}