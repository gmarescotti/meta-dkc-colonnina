
SUMMARY = "Django model mixins and utilities"
HOMEPAGE = "https://github.com/jazzband/django-model-utils"
AUTHOR = "Carl Meyer <carl@oddbird.net>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f33ea75fea1875ebb7625665f08f6d19"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/a5/7c/50b36fb5b1e63888107f0d215cae87197165e47de42b9d4142740547fba4/django-model-utils-4.1.1.tar.gz"
SRC_URI[md5sum] = "226ff9af6cf9e43a2ac8d774d1ef8233"
SRC_URI[sha256sum] = "eb5dd05ef7d7ce6bc79cae54ea7c4a221f6f81e2aad7722933aee66489e7264b"

S = "${WORKDIR}/django-model-utils-4.1.1"

DEPENDS += " ${PYTHON_PN}-setuptools-scm-native"
RDEPENDS_${PN} = "python3-django"

BBCLASSEXTEND = "native nativesdk"
