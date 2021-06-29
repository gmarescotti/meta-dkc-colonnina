
SUMMARY = "Group accounts for Django"
HOMEPAGE = "https://github.com/bennylope/django-organizations/"
AUTHOR = "Ben Lopatin <ben@benlopatin.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9347b4d7b54cd5c0ca25f3dfdfde6687"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/da/79/b43f7ddfeba90ec8ff18962d9ca2be813453790752dde235774aed24311c/django-organizations-2.0.0.tar.gz"
SRC_URI[md5sum] = "7897f18c913e29b541008e1f0bbce47a"
SRC_URI[sha256sum] = "e720dca732b5cb83878b2ef987cff026ffab05aa7d8bab8c1ec4add3c0c41d57"

S = "${WORKDIR}/django-organizations-2.0.0"

DEPENDS += " "
RDEPENDS_${PN} = "python3-six python3-django"

BBCLASSEXTEND = "native nativesdk"
