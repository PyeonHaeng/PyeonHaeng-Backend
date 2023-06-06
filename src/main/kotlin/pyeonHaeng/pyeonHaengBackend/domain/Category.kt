package pyeonHaeng.pyeonHaengBackend.domain

import jakarta.persistence.*

@Entity
class Category(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    var id: Long = 0,

    var name: String,
    var image: String,

    @OneToMany(mappedBy = "category")
    var subCategoryList: List<SubCategory> = mutableListOf()
) : BaseEntity() {
}