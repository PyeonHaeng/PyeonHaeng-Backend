package pyeonHaeng.pyeonHaengBackend.domain

import jakarta.persistence.Column
import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class BaseEntity(
    @CreatedDate
    @Column(nullable = false, updatable = false)
    var createdDate: LocalDateTime? = null,

    @LastModifiedDate
    @Column(nullable = false)
    var modifiedDate: LocalDateTime? = null,

    var isDeleted: Boolean = false
) {
}